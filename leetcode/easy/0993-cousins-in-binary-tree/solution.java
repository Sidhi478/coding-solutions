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