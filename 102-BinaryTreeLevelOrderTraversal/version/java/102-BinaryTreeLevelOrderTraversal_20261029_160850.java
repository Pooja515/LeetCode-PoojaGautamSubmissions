// Last updated: 29/10/2026, 16:08:50
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
21        Queue<TreeNode> q= new LinkedList<>();
22        q.offer(root);
23
24        while(!q.isEmpty()){
25            List<Integer> level = new ArrayList<>();
26            int n= q.size();
27          
28         
29            for(int i=0;i<n;i++){
30               TreeNode node = q.poll();
31               level.add(node.val);
32               if(node.left != null) q.offer(node.left);
33               if(node.right != null) q.offer(node.right);
34            }
35            ans.add(level);
36        }
37
38        return ans;
39    }
40}