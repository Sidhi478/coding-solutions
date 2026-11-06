# Valid Anagram

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

 

 **Example 1:** 

 **Input:**  s = "anagram", t = "nagaram"

 **Output:**  true

 **Example 2:** 

 **Input:**  s = "rat", t = "car"

 **Output:**  false

 

 **Constraints:** 

- 1 <= s.length, t.length <= 5 * 104
- s and t consist of lowercase English letters.

 

 **Follow up:**  What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

## Solution

**Language:** Java  
**Runtime:** 19 ms (beats 11.71%)  
**Memory:** 46.1 MB (beats 38.67%)  
**Submitted:** 2026-11-06T16:32:45.462Z  

```java

import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        // Step 1: Count frequency of characters in s
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Decrease frequency using characters of t
        for (int i = 0; i < t.length(); i++) {

            char ch = t.charAt(i);

            if (map.containsKey(ch)) {

                if (map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }

            } else {
                return false;
            }
        }

        return map.isEmpty();
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/valid-anagram/)