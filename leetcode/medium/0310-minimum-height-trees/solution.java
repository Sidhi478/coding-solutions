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