select * from Cinema c
where (c.id%2!=0) and description not in ('boring')
order by rating desc
