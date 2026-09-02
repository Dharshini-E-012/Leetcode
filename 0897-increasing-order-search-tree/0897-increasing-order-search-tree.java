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
    TreeNode head;
    TreeNode current;

    public TreeNode increasingBST(TreeNode root) {
        inorder(root);
        return head;
    }

    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);

        TreeNode node = new TreeNode(root.val);

        if (head == null) {
            head = node;
            current = node;
        } else {
            current.right = node;
            current = node;
        }

        inorder(root.right);
    }
}