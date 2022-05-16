package example

import groovy.sql.Sql

import javax.sql.DataSource


class QueriesController {

    def dataSource

    def index() {
    }

    /*
       Запрос с фильтрацией и сортировкой.
       Вывести города, расстояние до котрых больше (число).
    */
    def filteringAndSorting = {
        params.distanceFrom = params.distanceFrom ?: 0
        Long distanceFrom = params.distanceFrom as Long
        def results = Town.listOrderByName(order: 'asc').findAll {
            it.distance >= distanceFrom
        }

        render(view: 'filteringAndSorting',
                model: [results: results, distanceFrom: distanceFrom, resultCount: results.size()])
    }

    /* OUTER JOIN  вывести всех сотрудников кто проходит медицинский осмотр и кто не проходил */
    /*SELECT employee.id, medical_examination_date from employee
    left outer join medical_examination me on employee.id = me.employee_id
            order by id;
     */

    /* OUTER JOIN
      Вывести фамилии всех работников(employee),
      которые ещё не определены ни в какой отдел (department)
  */


//SELECT employee.id, medical_examination_date from employee left outer join medical_examination me on employee.id = me.employee_id
        def outerJoin = {
            def queryString = "SELECT * FROM employee e LEFT OUTER JOIN medical_examination me on me.employee_id = e.id WHERE me.medical_examination =   "
            def sql = new Sql(dataSource as DataSource)
            List<Employee> results = new ArrayList<Employee>()
            sql.rows(queryString).each {
                results.add(Employee.findById(it.id))
            }

            render(view: 'outerJoin',
                    model: [results: results, resultCount: results.size()])

            /*  AVG Найти среднюю зарпалату работников по бригадам 1 и 2  */


        }
}