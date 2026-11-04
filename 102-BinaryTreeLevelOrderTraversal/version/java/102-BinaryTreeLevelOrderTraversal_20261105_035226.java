// Last updated: 05/11/2026, 03:52:26
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
17    public List<List<Integer>> levelOrder(TreeNode root) {
18        List<List<Integer>> ans = new ArrayList<>();
19        if(root == null) return ans;
20
21        Queue<TreeNode> q = new LinkedList<>();
22        q.offer(root);
23        while(!q.isEmpty()){
24            int n = q.size();
25            List<Integer> level = new ArrayList<>();
26            for(int i=0;i<n;i++){
27                TreeNode node = q.poll();
28                level.add(node.val);
29                if(node.left != null) q.offer(node.left);
30                if(node.right != null) q.offer(node.right);
31            }
32            ans.add(level);
33        }
34        return ans;
35    }
36}