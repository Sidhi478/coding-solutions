# Cousins in Binary Tree

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the `root` of a binary tree with unique values and the values of two different nodes of the tree `x` and `y`, return `true`  *if the nodes corresponding to the values* `x` *and* `y` *in the tree are  **cousins**, or* `false` *otherwise.* 

Two nodes of a binary tree are  **cousins**  if they have the same depth with different parents.

Note that in a binary tree, the root node is at the depth `0`, and children of each depth `k` node are at the depth `k + 1`.

 

 **Example 1:** 

```
Input: root = [1,2,3,4], x = 4, y = 3
Output: false

```

 **Example 2:** 

```
Input: root = [1,2,3,null,4,null,5], x = 5, y = 4
Output: true

```

 **Example 3:** 

```
Input: root = [1,2,3,null,4], x = 2, y = 3
Output: false

```

 

 **Constraints:** 

- The number of nodes in the tree is in the range [2, 100].
- 1 <= Node.val <= 100
- Each node has a unique value.
- x != y
- x and y are exist in the tree.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43.1 MB (beats 74.61%)  
**Submitted:** 2026-10-13T16:02:16.100Z  

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
    int depthX = -1, depthY = -1;
    TreeNode parentX = null, parentY = null;

    public boolean isCousins(TreeNode root, int x, int y) {
        find(root, null, 0, x, y);

        return depthX == depthY && parentX != parentY;
    }

    void find(TreeNode root, TreeNode parent, int depth, int x, int y) {
        if (root == null) {
            return;
        }

        if (root.val == x) {
            depthX = depth;
            parentX = parent;
        }

        if (root.val == y) {
            depthY = depth;
            parentY = parent;
        }

        find(root.left, root, depth + 1, x, y);
        find(root.right, root, depth + 1, x, y);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/cousins-in-binary-tree/)