# Intersection of Multiple Arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a 2D integer array `nums` where `nums[i]` is a non-empty array of  **distinct**  positive integers, return  *the list of integers that are present in  **each array**  of*  `nums` *sorted in  **ascending order***.

 

 **Example 1:** 

```
Input: nums = [[3,1,2,4,5],[1,2,3,4],[3,4,5,6]]
Output: [3,4]
Explanation: 
The only integers present in each of nums[0] = [3,1,2,4,5], nums[1] = [1,2,3,4], and nums[2] = [3,4,5,6] are 3 and 4, so we return [3,4].
```

 **Example 2:** 

```
Input: nums = [[1,2,3],[4,5,6]]
Output: []
Explanation: 
There does not exist any integer present both in nums[0] and nums[1], so we return an empty list [].

```

 

 **Constraints:** 

- 1 <= nums.length <= 1000
- 1 <= sum(nums[i].length) <= 1000
- 1 <= nums[i][j] <= 1000
- All the values of nums[i] are unique.

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 57.06%)  
**Memory:** 46.3 MB (beats 89.59%)  
**Submitted:** 2026-10-15T15:40:27.916Z  

```java
import java.util.*;

class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> ans = new ArrayList<>();

        for (int num : nums[0]) {
            boolean found = true;

            for (int i = 1; i < nums.length; i++) {
                boolean present = false;

                for (int x : nums[i]) {
                    if (x == num) {
                        present = true;
                        break;
                    }
                }

                if (!present) {
                    found = false;
                    break;
                }
            }

            if (found) {
                ans.add(num);
            }
        }

        Collections.sort(ans);
        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/intersection-of-multiple-arrays/)