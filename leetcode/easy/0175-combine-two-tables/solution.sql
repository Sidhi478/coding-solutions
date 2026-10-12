# Write your MySQL query statement below
Select firstName,lastName,city,state
from person left join Address 
on person.personId=Address.personId;