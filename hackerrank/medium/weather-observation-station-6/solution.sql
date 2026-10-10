/*
Enter your query here.
*/
Select distinct city 
from station
where city like 'A%'
or city like 'E%'
or city like 'I%'
or city like 'o%'
or city like 'U%';
