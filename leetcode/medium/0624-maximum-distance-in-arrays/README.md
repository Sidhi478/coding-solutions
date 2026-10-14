# Maximum Distance in Arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given `m` `arrays`, where each array is sorted in  **ascending order**.

You can pick up two integers from two different arrays (each array picks one) and calculate the distance. We define the distance between two integers `a` and `b` to be their absolute difference `|a - b|`.

Return  *the maximum distance*.

 

 **Example 1:** 

```
Input: arrays = [[1,2,3],[4,5],[1,2,3]]
Output: 4
Explanation: One way to reach the maximum distance 4 is to pick 1 in the first or third array and pick 5 in the second array.

```

 **Example 2:** 

```
Input: arrays = [[1],[1]]
Output: 0

```

 

 **Constraints:** 

- m == arrays.length
- 2 <= m <= 105
- 1 <= arrays[i].length <= 500
- -104 <= arrays[i][j] <= 104
- arrays[i] is sorted in ascending order.
- There will be at most 105 integers in all the arrays.

## Solution

**Language:** Java  
**Runtime:** 10 ms (beats 27.88%)  
**Memory:** 142.7 MB (beats 91.38%)  
**Submitted:** 2026-10-14T16:29:01.842Z  

```java
class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min=arrays.get(0).get(0);
       int max = arrays.get(0).get(arrays.get(0).size() - 1);
       int ans=0;
       for(int i=1;i<arrays.size();i++){
        int currmin=arrays.get(i).get(0);
       int currmax = arrays.get(i).get(arrays.get(i).size() - 1);

        ans=Math.max(ans,Math.max(
            Math.abs(currmax-min),
            Math.abs(max-currmin)
        ));
        min=Math.min(min,currmin);
        max=Math.max(max,currmax);
       }
       return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-distance-in-arrays/)