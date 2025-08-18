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
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> list = new ArrayList<>();
        traverse(root, list, "");
        return list;
    }

    private static void traverse(TreeNode root, List<String> list, String str){
        if(root == null) return;
        
        if(root.left == null && root.right == null){
            list.add(str + root.val);
            return;
        }
        traverse(root.left, list, str + root.val + "->");
        traverse(root.right, list, str + root.val + "->");
    }
}
