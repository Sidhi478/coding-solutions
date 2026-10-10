# Higher Than 75 Marks

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Query the *Name* of any student in **STUDENTS** who scored higher than $75$ *Marks*. Order your output by the *last three characters* of each name. If two or more students both have names ending in the same last three characters (i.e.: Bobby, Robby, etc.), secondary sort them by ascending *ID*.

**Input Format**

The **STUDENTS** table is described as follows:
<img src="https://s3.amazonaws.com/hr-challenge-images/12896/1443815243-94b941f556-1.png" />
The *Name* column only contains uppercase (`A`-`Z`) and lowercase (`a`-`z`) letters.

**Constraints**

 

**Output Format**

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-10T06:16:59.290Z  

```sql
/*
Enter your query here.
*/
select name 
from students
where marks>75
order by(right(name,3)), id Asc;

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/more-than-75-marks/problem)