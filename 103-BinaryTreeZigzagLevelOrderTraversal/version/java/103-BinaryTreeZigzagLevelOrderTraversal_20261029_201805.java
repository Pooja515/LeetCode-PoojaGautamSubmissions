// Last updated: 29/10/2026, 20:18:05
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
21        Queue<TreeNode> q = new LinkedList<>();
22        q.offer(root);
23
24        
25        boolean flag = true;
26        while(!q.isEmpty()){
27            List<Integer> level = new ArrayList<>();
28            int n= q.size();
29
30
31            for(int i=0;i<n;i++){
32                TreeNode  node = q.poll();
33                level.add(node.val);
34
35                    if(node.left != null) q.offer(node.left);
36                    if(node.right != null) q.offer(node.right);
37                
38            }
39            if(!flag){
40                        Collections.reverse(level);
41                    }
42
43            ans.add(level);
44            flag = !flag;
45        }
46        return ans;
47    }
48}