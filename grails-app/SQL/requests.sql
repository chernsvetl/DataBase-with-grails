/*  AVG Найти среднюю зарпалату работников по бригадам 1 и 2  */
SELECT AVG(salary) FROM employee
WHERE (brigade_id='1' or brigade_id='2');

/* HAVING + GROUP BY Получить список всех сотрудников,
чья максимальная зарплата превышает 80000, из таблицы сотрудников */
SELECT id, MAX(salary) FROM employee
GROUP BY id
HAVING MAX(salary)>80000
ORDER BY salary DESC;

/* INNER  3 */
SELECT * FROM human INNER JOIN employee e on human.id = e.id INNER JOIN medical_examination me on e.id = me.employee_id
WHERE me.is_passed = 'true' AND me.medical_examination_date = '2021-03-03';

/* Используя подзапрос, перечислить id работников, имеющих зарплату больше, чем работник №14 */
SELECT employee.id FROM employee INNER JOIN human h on h.id = employee.id
WHERE salary > (SELECT max(salary) FROM employee WHERE id = '13');

/* CTE + RECURSIVE Найти сумму зарплат работников менее 30000 */
With CTE AS (Select id,salary FROM employee )
SELECT * FROM CTE;

WITH RECURSIVE t(n) AS ( VALUES (0)  UNION ALL
SELECT salary FROM employee WHERE employee.salary < 30000
)
SELECT sum(n) FROM t;

/* OUTER JOIN  вывести всех сотрудников кто проходит медицинский осмотр и кто не проходил */
SELECT employee.id, medical_examination_date from employee
left outer join medical_examination me on employee.id = me.employee_id
order by id;


/* C фильтрацией и сортировкой. Вывести количество детей у работников, чьи зарплаты выше 200000 */

SELECT employee.id, number_of_children from employee INNER JOIN human h on h.id = employee.id
WHERE salary>200000
ORDER BY id ASC;

/* Оконные функции Сравнить различные рейсы по стоимости и найти максимальную цену за билет на рейс */
SELECT id, flight_id, price,
       MAX(price) OVER (PARTITION BY flight_id) as max_ticket_price
FROM ticket
order by flight_id;


/* CROSS JOIN */



