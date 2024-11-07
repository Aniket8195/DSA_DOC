
select s.name 
from Salesperson s 
where s.name 
not in (
    select s.name from salesperson s join orders o on s.sales_id=o.sales_id 
left join Company c on c.com_id = o.com_id where c.name="RED"
);
