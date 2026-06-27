// Last updated: 28/06/2026, 01:04:11
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
     List<Integer> ans;
    public List<Integer> postorderTraversal(TreeNode root) {
         ans = new ArrayList<>();
        if(root == null ) return ans;
        f(root);
        return ans;
    }
    void f(TreeNode node){
        if(node == null ) return ;
        if(node.left != null) f(node.left);
        if(node.right != null) f(node.right);

        ans.add(node.val);
    }

}