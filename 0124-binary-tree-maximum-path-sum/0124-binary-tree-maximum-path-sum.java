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
    
    int maxSum = Integer.MIN_VALUE;
    
    public int maxPathSum(TreeNode root) {
        
        findMax(root);
        
        return maxSum;
    }

    private int findMax(TreeNode root) {
        
        if (root == null) {
            return 0;
        }
        int left = Math.max(0, findMax(root.left));
        int right = Math.max(0, findMax(root.right));
        int currentPath = left + root.val + right;
        maxSum = Math.max(maxSum, currentPath);
        return root.val + Math.max(left, right);
    }
}