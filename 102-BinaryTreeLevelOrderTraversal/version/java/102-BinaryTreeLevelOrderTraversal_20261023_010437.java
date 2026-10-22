// Last updated: 23/10/2026, 01:04:37
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
19        Queue<TreeNode> q = new LinkedList<>();
20        if(root == null) return ans;
21        q.offer(root);
22        while(!q.isEmpty()){
23            int n = q.size();
24            List<Integer> level = new ArrayList<>();
25            for(int i=0;i<n;i++){
26                TreeNode node = q.poll();
27                level.add(node.val);
28                if(node.left != null) q.offer(node.left);
29                if(node.right != null) q.offer(node.right);
30            }
31            ans.add(level);
32
33        }
34
35        return ans;
36        
37    }
38}