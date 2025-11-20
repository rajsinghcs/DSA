# Write your MySQL query statement below
-- select salary as SecondHighestSalary from Employee order by salary desc limit 1,1;

-- select COALESCE((select salary from Employee order by salary desc limit 1,1),null) as SecondHighestSalary ;

select max(salary) as SecondHighestSalary from employee where salary < (select max(salary) from employee);