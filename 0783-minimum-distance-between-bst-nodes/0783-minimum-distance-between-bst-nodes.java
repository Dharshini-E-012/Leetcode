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
    
    int previous = -1;
    int minimum = Integer.MAX_VALUE;
    
    public int minDiffInBST(TreeNode root) {
        
        inorder(root);
        
        return minimum;
    }
    
    private void inorder(TreeNode root) {
        
        if (root == null) {
            return;
        }
        
        // Visit left subtree
        inorder(root.left);
        
        // Compare with previous value
        if (previous != -1) {
            minimum = Math.min(
                minimum,
                root.val - previous
            );
        }
        
        previous = root.val;
        
        // Visit right subtree
        inorder(root.right);
    }
}