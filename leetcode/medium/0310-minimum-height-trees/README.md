# Minimum Height Trees

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

A tree is an undirected graph in which any two vertices are connected by  *exactly*  one path. In other words, any connected graph without simple cycles is a tree.

Given a tree of `n` nodes labelled from `0` to `n - 1`, and an array of `n - 1` `edges` where `edges[i] = [ai, bi]` indicates that there is an undirected edge between the two nodes `ai` and `bi` in the tree, you can choose any node of the tree as the root. When you select a node `x` as the root, the result tree has height `h`. Among all possible rooted trees, those with minimum height (i.e. `min(h)`)  are called  **minimum height trees**  (MHTs).

Return  *a list of all  **MHTs'**  root labels*. You can return the answer in  **any order**.

The  **height**  of a rooted tree is the number of edges on the longest downward path between the root and a leaf.

 

 **Example 1:** 

```
Input: n = 4, edges = [[1,0],[1,2],[1,3]]
Output: [1]
Explanation: As shown, the height of the tree is 1 when the root is the node with label 1 which is the only MHT.

```

 **Example 2:** 

```
Input: n = 6, edges = [[3,0],[3,1],[3,2],[3,4],[5,4]]
Output: [3,4]

```

 

 **Constraints:** 

- 1 <= n <= 2 * 104
- edges.length == n - 1
- 0 <= ai, bi < n
- ai != bi
- All the pairs (ai, bi) are distinct.
- The given input is guaranteed to be a tree and there will be no repeated edges.

## Solution

**Language:** Java  
**Runtime:** 18 ms (beats 57.50%)  
**Memory:** 63.5 MB (beats 67.82%)  
**Submitted:** 2026-10-26T17:32:06.123Z  

```java
import java.util.*;

class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {

        List<Integer> result = new ArrayList<>();

        // Special case: only one node
        if (n == 1) {
            result.add(0);
            return result;
        }

        // Create adjacency list
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // Build the graph
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        // Store degree (number of neighbors) of each node
        int[] degree = new int[n];

        Queue<Integer> queue = new LinkedList<>();

        // Add all leaf nodes to the queue
        for (int i = 0; i < n; i++) {
            degree[i] = adj.get(i).size();

            if (degree[i] == 1) {
                queue.offer(i);
            }
        }

        int remainingNodes = n;

        // Remove leaves level by level
        while (remainingNodes > 2) {

            int size = queue.size();

            remainingNodes -= size;

            for (int i = 0; i < size; i++) {
                int leaf = queue.poll();

                for (int neighbor : adj.get(leaf)) {
                    degree[neighbor]--;

                    if (degree[neighbor] == 1) {
                        queue.offer(neighbor);
                    }
                }
            }
        }

        // Remaining nodes are MHT roots
        while (!queue.isEmpty()) {
            result.add(queue.poll());
        }

        return result;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/minimum-height-trees/)