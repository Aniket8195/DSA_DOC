select a1.actor_id , a1.director_id
from ActorDirector a1
group by a1.actor_id , a1.director_id
having count(a1.actor_id)>=3
