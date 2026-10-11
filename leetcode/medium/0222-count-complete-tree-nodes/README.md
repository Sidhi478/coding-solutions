# Count Complete Tree Nodes

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the `root` of a  **complete**  binary tree, return the number of the nodes in the tree.

According to  **Wikipedia**, every level, except possibly the last, is completely filled in a complete binary tree, and all nodes in the last level are as far left as possible. It can have between `1` and `2h` nodes inclusive at the last level `h`.

Design an algorithm that runs in less than `O(n)` time complexity.

 

 **Example 1:** 

```
Input: root = [1,2,3,4,5,6]
Output: 6

```

 **Example 2:** 

```
Input: root = []
Output: 0

```

 **Example 3:** 

```
Input: root = [1]
Output: 1

```

 

 **Constraints:** 

- The number of nodes in the tree is in the range [0, 5 * 104].
- 0 <= Node.val <= 5 * 104
- The tree is guaranteed to be complete.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 49.6 MB (beats 10.12%)  
**Submitted:** 2026-10-11T09:49:37.567Z  

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

class Solution {
    public int countNodes(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int leftHeight = leftHeight(root);
        int rightHeight = rightHeight(root);

        if(leftHeight == rightHeight) {
            return (int) Math.pow(2, leftHeight) - 1;
        }

        return countNodes(root.left) + countNodes(root.right) + 1;
    }

    public int leftHeight(TreeNode root) {
        int height = 0;
        while(root != null) {
            height++;
            root = root.left;
        }
        return height;
    }

    public int rightHeight(TreeNode root) {
        int height = 0;
        while(root != null) {
            height++;
            root = root.right;
        }
        return height;
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/count-complete-tree-nodes/)