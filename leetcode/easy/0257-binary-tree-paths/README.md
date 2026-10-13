# Binary Tree Paths

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given the `root` of a binary tree.

Return all  **root-to-leaf**  paths in  **any order**.

A  **leaf**  is a node with no children.

 

 **Example 1:** 

```
Input: root = [1,2,3,null,5]
Output: ["1->2->5","1->3"]

```

 **Example 2:** 

```
Input: root = [1]
Output: ["1"]

```

 

 **Constraints:** 

- The number of nodes in the tree is in the range [1, 100].
- -100 <= Node.val <= 100

## Solution

**Language:** Java  
**Runtime:** 5 ms (beats 40.00%)  
**Memory:** 49.5 MB (beats 56.30%)  
**Submitted:** 2026-10-13T15:55:59.727Z  

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        findPaths(root, "", ans);
        return ans;
    }

    public void findPaths(TreeNode root, String path, List<String> ans) {
        if (root == null) {
            return;
        }

        if (path.isEmpty()) {
            path = "" + root.val;
        } else {
            path = path + "->" + root.val;
        }

        if (root.left == null && root.right == null) {
            ans.add(path);
            return;
        }

        findPaths(root.left, path, ans);
        findPaths(root.right, path, ans);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/binary-tree-paths/)