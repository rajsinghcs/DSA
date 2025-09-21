# Write your MySQL query statement below
select NAME
from SALESPERSON
where SALES_ID not in (select O.SALES_ID
from ORDERS O inner join COMPANY C
on O.COM_ID = C.COM_ID
where C.NAME = 'RED');