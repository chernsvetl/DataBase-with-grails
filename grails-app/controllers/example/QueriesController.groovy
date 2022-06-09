package example

import groovy.sql.Sql

import javax.sql.DataSource


class QueriesController {

    def dataSource

    def index() {
    }

    def filtering = {
        params.from = params.from ?: 0
        params.to = params.to ?: 100000


        String name = params.name as String
        String country = params.country as String
        Integer from = params.from as Integer ?: 0
        Integer to = params.to as Integer ?: 100000

        def results
        if (name == null && country == null) {
            results = TownExample.findAll()
        } else if (name == "" && country == "") {
            results = TownExample.findAllByDistanceBetween(from, to)
        } else if (name != "" && country == "") {
            results = TownExample.findAllByNameAndDistanceBetween(name, from, to)
        } else if (name == "" && country != "") {
            results = TownExample.findAllByCountryAndDistanceBetween(country, from, to)
        } else if (name != "" && country != "") {
            results = TownExample.findAllByNameAndCountryAndDistanceBetween(name, country, from, to)
        }
        //print(results)

        render(view: 'filtering', model: [
                results: results,
                resultCount: results.size()])

    }



    /* Вывести города, расстояние до которых больше (число). */
    def filteringAndSorting = {
        params.distanceFrom = params.distanceFrom ?: 0
        Long distanceFrom = params.distanceFrom as Long
        def results = Town.listOrderByName(order: 'asc').findAll {
            it.distance >= distanceFrom
        }

        render(view: 'filteringAndSorting',
                model: [results: results, distanceFrom: distanceFrom, resultCount: results.size()])
    }


    /*Вывести фамилии работников(employee),которые проходили медицинский осмотр*/
    def innerJoin = {
        List<Employee> results = new ArrayList<Employee>()
        MedicalExamination.list().each {
            results.add(it.employee)
        }

        render(view: 'innerJoin',
                model: [results: results, resultCount: results.size()])
    }

    /*Вывести отдельно списки людей  мужского и женского пола */
    def groupBy = {
        def results = Human.findAll().groupBy {
            it.genderId
        }

        render(view: 'groupBy',
                model: [results: results, resultCount: results.size()])
    }


    /*   Вывести сотрудников, у которых зарпалата выше среднего. */
    def having = {
        def queryString = "select e.id as eid, full_name , salary from employee e  inner join human h on e.human_id_id = h.id " +
                "group by e.id, salary, full_name " +
                "having salary > (select avg(salary) from employee) " +
                "order by salary desc;"
        def sql = new Sql(dataSource as DataSource)
        List<Employee> results = new ArrayList<Employee>()
        sql.rows(queryString).each {
            Map<String, String> params = new HashMap<>();
            results.add(Employee.findById((Long) it.get("eid"), null) as Employee)
            print(it)
        }

        render(view: 'having',
                model: [results: results, resultCount: results.size()])

    }

    /* Вывести всех сотрудников кто проходит медицинский осмотр и кто не проходил. */

    def outerJoin = {
        def queryString = "select  employee.id as eid, me.id as mid  from employee left outer join medical_examination  me on employee.id = me.employee_id  order by medical_examination ;"
        def sql = new Sql(dataSource as DataSource)
        Map<Employee, List<MedicalExamination>> results = new HashMap<Employee, List<MedicalExamination>>()
        sql.rows(queryString).each {
            Employee employee = Employee.findById((Long) it.get("eid"), null);
            MedicalExamination examination = MedicalExamination.findById((Long) it.get("mid", null));
            if (results.containsKey(employee)) {
                List<MedicalExamination> list = results.get(employee);
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(examination);
                results.put(employee, list);
            } else {
                List<MedicalExamination> list;
                if (examination == null) {
                    list = null;
                } else {
                    list = new ArrayList<>();
                    list.add(examination);
                }
                results.put(employee, list);
            }
        }

        render(view: 'outerJoin',
                model: [results: results, resultCount: results.size()])
    }


    /* Вывести города, расстояние до которых меньше 200 */
    def cte = {
        def queryString = "with CTE as (select name, distance from town) " +
                "select  name from CTE " +
                "where distance < 200"

        def sql = new Sql(dataSource as DataSource)
        List<Town> results = new ArrayList<Town>()
        sql.rows(queryString).each {
            results.add(Town.findByName((String) it.get("name"), null) as Town)
            print(it)
        }

        render(view: 'cte',
                model: [results: results, resultCount: results.size()])

    }

    /* Сравнить различные рейсы по стоимости и найти максимальную цену за билет на рейс */
    def windowFunc = {

        def queryString = "select id as tid, flights_id , price, max(price) over (partition by flights_id ) as max_ticket_price " +
                "from ticket " +
                "order by flights_id;";

        def sql = new Sql(dataSource as DataSource)
        List<Tuple2<Ticket, Long>> results = new ArrayList<Tuple2<Ticket, Long>>()
        sql.rows(queryString).each {
            results.add(new Tuple2<Ticket, Long>(
                    Ticket.findById((Long) it.get("tid"), null) as Ticket,
                    (Long) it.get("max_ticket_price")
            ));
            //print(it)
        }
        render(view: 'windowFunc',
                model: [results: results, resultCount: results.size()])
    }

    /* Найти сумму зарплат работников менее 30000 */
    def recursive = {
        def queryString = "with recursive t(n) as ( values (0)  union all " +
                "select salary from employee e where e.salary < 30000 " +
                ") " +
                "select sum(n) from t;"

        def sql = new Sql(dataSource as DataSource)
        List<Long> results = new ArrayList<Long>()
        sql.rows(queryString).each {
            results.add((Long) it.get("sum"));
            //print(it)
        }
        render(view: 'recursive',
                model: [results: results, resultCount: results.size()])
    }

    def crossJoin = {
        def queryString = " select employee_id as eid ,medical_examination from employee cross join medical_examination " +
                "        where employee.id = medical_examination.employee_id  and salary = '250000' ";
        def sql = new Sql(dataSource as DataSource)
        List<Employee> results = new ArrayList<Employee>()
        sql.rows(queryString).each {
            results.add(Employee.findById((Long) it.get("eid"), null) as Employee)
            print(it)
        }

        render(view: 'crossJoin',
                model: [results: results, resultCount: results.size()])

    }


    /* https://medium.com/kkempin/postgresqls-lateral-join-bfd6bd0199df */
    def lateralJoin = {

        def queryString = " select  id as tid, plane_id, first_repair_time, next_repair_time, id from " +
                "  (select plane_id, min(start_time ) as first_repair_time from repair group by plane_id) o1 " +
                "  left join lateral " +
                "  (select id, start_time as next_repair_time " +
                "   from repair " +
                "   where plane_id = o1.plane_id and start_time  > o1.first_repair_time " +
                "   order by start_time asc limit 1) " +
                "   o2 on true; "

        def sql = new Sql(dataSource as DataSource)
        List<Tuple4<Repair, Date, Date, Long>> results = new ArrayList<Tuple4<Repair, Date, Date, Long>>()
        sql.rows(queryString).each {
            results.add(new Tuple4<Repair, Date, Date, Long>(
                    Repair.findById((Long) it.get("tid") as Long, null) as Repair,
                    (Date) it.get("first_repair_time"), (Date) it.get("next_repair_time"), (Long) it.get("plane_id")
            ));
            //print(it)
        }
        render(view: 'lateralJoin',
                model: [results: results, resultCount: results.size()])
    }

}






