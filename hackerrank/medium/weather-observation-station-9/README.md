# Weather Observation Station 9

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Query the list of *CITY* names from **STATION** that *do not start* with vowels. Your result cannot contain duplicates.

**Input Format**

The **STATION** table is described as follows:

<img src="https://s3.amazonaws.com/hr-challenge-images/9336/1449345840-5f0a551030-Station.jpg" title="Station.jpg" />

where *LAT\_N* is the northern latitude and *LONG\_W* is the western longitude. 

**Output Format**

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-10T05:42:43.924Z  

```sql
/*
Enter your query here.
*/
select distinct city 
from station 
where lower(left(city,1)) not in('a','e','i','o','u');

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/weather-observation-station-9/problem)