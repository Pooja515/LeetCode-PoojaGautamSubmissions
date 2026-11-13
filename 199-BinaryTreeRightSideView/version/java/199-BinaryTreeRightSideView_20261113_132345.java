// Last updated: 13/11/2026, 13:23:45
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
17    public List<Integer> rightSideView(TreeNode root) {
18        List<Integer> ans = new ArrayList<>();
19        if (root == null)
20            return ans;
21        Queue<TreeNode> q = new LinkedList<>();
22
23        q.offer(root);
24        while (!q.isEmpty()) {
25            int n = q.size();
26            List<Integer> level = new ArrayList<>();
27            for (int i = 0; i < n; i++) {
28                TreeNode node = q.poll();
29                if(i==n-1) ans.add(node.val);
30                
31                    if (node.left != null)
32                        q.offer(node.left);
33                    if (node.right != null)
34                        q.offer(node.right);
35              
36            }
37           
38        }
39        return ans;
40    }
41}