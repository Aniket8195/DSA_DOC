select e.employee_id 
from Employees e
left join Employees e2
on e.manager_id=e2.employee_id
where e2.employee_id is null and e.salary<30000 and e.manager_id is not null
order by employee_id
