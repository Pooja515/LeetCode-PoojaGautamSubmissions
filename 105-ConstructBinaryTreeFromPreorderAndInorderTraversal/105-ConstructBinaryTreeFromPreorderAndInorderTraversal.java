// Last updated: 28/06/2026, 01:04:29
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
    int pre=0;
    HashMap<Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
           }
       return  build(preorder,0,inorder.length-1);
    }
    TreeNode  build(int[] preorder,int left,int right){
        if(left>right) return null;
        int rootval=preorder[pre++];
        TreeNode root=new TreeNode(rootval);
        int in=map.get(rootval);
        root.left=build(preorder,left,in-1);
        root.right=build(preorder,in+1,right);
        return root;

    }
}