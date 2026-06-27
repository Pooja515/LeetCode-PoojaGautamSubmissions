// Last updated: 28/06/2026, 01:04:25
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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        dfs(root,targetSum,path,res);
        return res;
    }
    void dfs(TreeNode node,int targetSum, List<Integer> path,List<List<Integer>> res){
        if(node==null) return;
        path.add(node.val);
        if(node.left==null && node.right==null && node.val==targetSum)
              res.add(new ArrayList<>(path));
        int remainsum=targetSum-node.val;
        dfs(node.left,remainsum,path,res);
        dfs(node.right,remainsum,path,res);
        path.remove(path.size()-1);
    }
}