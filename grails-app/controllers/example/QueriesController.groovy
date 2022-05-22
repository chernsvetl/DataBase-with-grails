package example

import groovy.sql.Sql

import javax.sql.DataSource


class QueriesController {

    def dataSource

    def index() {
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
        def queryString = " select employee_id as eid ,medical_examination from employee  cross join medical_examination \n" +
                "        where employee.id = medical_examination.employee_id ";
        def sql = new Sql(dataSource as DataSource)
        List<Employee> results = new ArrayList<Employee>()
        sql.rows(queryString).each {
            results.add(Employee.findById((Long) it.get("eid"), null) as Employee)
            print(it)
        }

        render(view: 'crossJoin',
                model: [results: results, resultCount: results.size()])

    }

}






