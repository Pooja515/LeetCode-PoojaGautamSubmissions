// Last updated: 22/10/2026, 23:03:25
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<Integer> postorderTraversal(TreeNode root) {
18        List<Integer> ans = new ArrayList<>();
19        if(root == null) return ans;
20        f(root,ans);
21        return ans;
22    }
23    void f(TreeNode node,List<Integer> ans){
24        if(node == null) return ;
25       f(node.left , ans); 
26       f(node.right ,ans);
27
28        ans.add(node.val);
29    }
30}