// Last updated: 28/06/2026, 01:04:22
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
    int maxsum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        pathsum(root);
        return maxsum;
    }
    int pathsum(TreeNode root){
        if(root==null) return 0;
        int l=pathsum(root.left);
        int r=pathsum(root.right);
        if(l<1) l=0;
        if(r<1) r=0;
        maxsum=Math.max(maxsum,root.val+l+r);

        return root.val+Math.max(l,r);
    }
}