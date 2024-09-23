select 
    user_id,
    count(follower_id) as followers_count
From
    Followers
Group by user_id
Order by user_id;
