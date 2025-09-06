# Write your MySQL query statement below
delete mail from Person mail join Person mailcopy on mail.email = mailcopy.email and mail.id > mailcopy.id;