select
(select Salary 
from Employee 
group by salary 
order by salary desc
limit 1 offset 1) 
as SecondHighestSalary;


# 2nd solution
select
(select distinct Salary 
from Employee order by salary desc 
limit 1 offset 1) 
as SecondHighestSalary;
