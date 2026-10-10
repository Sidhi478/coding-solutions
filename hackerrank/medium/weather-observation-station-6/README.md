# Weather Observation Station 6

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Query the list of *CITY* names starting with vowels (i.e., `a`, `e`, `i`, `o`, or `u`) from **STATION**. Your result *cannot* contain duplicates.

**Input Format**

The **STATION** table is described as follows:

<img src="https://s3.amazonaws.com/hr-challenge-images/9336/1449345840-5f0a551030-Station.jpg" title="Station.jpg" />

where *LAT\_N* is the northern latitude and *LONG\_W* is the western longitude.

**Constraints**

 

**Output Format**

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-10T05:31:18.668Z  

```sql
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

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/weather-observation-station-6/problem)