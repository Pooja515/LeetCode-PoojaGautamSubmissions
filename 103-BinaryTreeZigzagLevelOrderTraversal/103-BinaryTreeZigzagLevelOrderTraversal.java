// Last updated: 28/06/2026, 01:04:32
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res =new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
          Boolean leftRight=true;
        if(root==null) return res;
        q.add(root);
        while(!q.isEmpty()){
        int size=q.size();
        List<Integer> level = new ArrayList<>();
        for(int i=0;i<size;i++){
            TreeNode node =q.poll();
            level.add(node.val);
            if(node.left!=null)
                   q.add(node.left);
            if(node.right!=null)
                    q.add(node.right);
        }
       if (!leftRight) {
                Collections.reverse(level);
            }
        res.add(level);
        leftRight = !leftRight;
        }
  return res;
    }
}