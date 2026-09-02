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
    public int findSecondMinimumValue(TreeNode root) {
        
        int smallest = root.val;
        
        return find(root, smallest);
    }
    
    private int find(TreeNode root, int smallest) {
        
        if (root == null) {
            return -1;
        }

        if (root.val > smallest) {
            return root.val;
        }
        
        int left = find(root.left, smallest);
        int right = find(root.right, smallest);

        if (left == -1) {
            return right;
        }
        
        if (right == -1) {
            return left;
        }

        return Math.min(left, right);
    }
}