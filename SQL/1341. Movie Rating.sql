(SELECT u.name AS results
FROM MovieRating m 
JOIN Users u 
on m.user_id=u.user_id
GROUP BY name
ORDER BY COUNT(*) DESC, name
LIMIT 1)

UNION ALL

(SELECT title AS results
FROM MovieRating m 
JOIN Movies mv 
on m.movie_id=mv.movie_id
WHERE EXTRACT(YEAR_MONTH FROM created_at) = 202002
GROUP BY title
ORDER BY AVG(rating) DESC, title
LIMIT 1);
