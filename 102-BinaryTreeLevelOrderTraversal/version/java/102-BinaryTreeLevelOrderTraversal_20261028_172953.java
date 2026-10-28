// Last updated: 28/10/2026, 17:29:53
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
18        List<List<Integer>>  res = new ArrayList<>();
19
20        if(root == null) return res;
21
22        Queue<TreeNode> q= new LinkedList<>();
23        q.offer(root);
24
25        while(!q.isEmpty()){
26
27            List<Integer> level = new ArrayList<>();
28            int n =q.size();
29
30            for(int i=0;i<n;i++){
31                TreeNode node = q.poll();
32                level.add(node.val);
33                if(node.left != null) q.offer(node.left);
34                if(node.right != null) q.offer(node.right);
35            }
36            res.add(level);
37
38        }
39        return res;
40    }
41}