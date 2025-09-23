-- SELECT user_id,
--        email
-- FROM Users
-- WHERE email REGEXP '^[A-Za-z0-9_]+@[A-Za-z]+\\.com$';

select user_id, email from users
where   email REGEXP '^[a-zA-Z0-9_]+@[a-zA-Z]+\\.com$'
order by user_id