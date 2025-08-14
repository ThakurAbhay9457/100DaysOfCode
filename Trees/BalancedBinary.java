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
    public boolean isBalanced(TreeNode root) {
        if(root == null || root.val == -1){
            return true;
        }
        return checkBalance(root) != -1;
    }

    private int checkBalance(TreeNode root){
        if(root == null || root.val == -1){
            return 0;
        }

        int left = checkBalance(root.left);
        int right = checkBalance(root.right);
        if(left == -1 || right == -1 || Math.abs(left - right) > 1){
            return -1;
        }

        return 1 + Math.max(left, right);
    }
}
