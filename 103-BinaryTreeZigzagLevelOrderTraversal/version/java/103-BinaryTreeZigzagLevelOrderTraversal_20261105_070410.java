// Last updated: 05/11/2026, 07:04:10
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
17    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
18        List<List<Integer>> ans = new ArrayList<>();
19        if(root == null) return ans;
20
21        Queue<TreeNode> q= new LinkedList<>();
22        q.offer(root);
23        boolean flag = true;
24        while(!q.isEmpty()){
25            int n = q.size();
26            List<Integer> level = new ArrayList<>();
27            for(int i=0;i<n;i++){
28                TreeNode node = q.poll();
29                level.add(node.val);
30                if(node.left != null) q.offer(node.left);
31                if(node.right != null) q.offer(node.right);
32
33            }
34            if(!flag){
35                Collections.reverse(level);
36            }
37            ans.add(level);
38            flag = !flag;
39        }
40        return ans;
41    }
42}