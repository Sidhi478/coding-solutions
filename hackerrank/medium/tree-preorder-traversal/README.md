# Tree: Preorder Traversal

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Complete the $preOrder$ function in the editor below, which has $1$ parameter: a pointer to the root of a binary tree. It must print the values in the tree's preorder traversal as a single line of space-separated values.  


**Input Format**

Our test code passes the root node of a binary tree to the *preOrder* function.

**Constraints**

  $1 \leq$ Nodes in the tree  $\leq 500 $

**Output Format**

Print the tree's preorder traversal as a single line of space-separated values.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-11T10:51:16.257Z  

```java

/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

    public static void preOrder(Node root) {
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);   

    }


```

---

[View on HackerRank](https://www.hackerrank.com/challenges/tree-preorder-traversal/problem)