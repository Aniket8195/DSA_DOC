select user_id, max(time_stamp) as last_stamp
from Logins l
where year(time_stamp) = '2020'
group by user_id
