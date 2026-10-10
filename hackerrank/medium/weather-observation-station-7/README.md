# Weather Observation Station 7

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Query the list of *CITY* names ending with vowels (a, e, i, o, u) from **STATION**. Your result *cannot* contain duplicates.


**Input Format**

The **STATION** table is described as follows:

<img src="https://s3.amazonaws.com/hr-challenge-images/9336/1449345840-5f0a551030-Station.jpg" title="Station.jpg" />

where *LAT\_N* is the northern latitude and *LONG\_W* is the western longitude.

**Output Format**

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-10T05:34:24.955Z  

```sql
/*
Enter your query here.
*/
SELECT distinct city
from station
where city like '%A'
or city like '%E'
or city like '%I'
or city like '%O'
or city like '%U';

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/weather-observation-station-7/problem)