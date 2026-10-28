// Last updated: 29/10/2026, 03:30:41
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
18        List<Integer> res = new ArrayList<>();
19        if(root == null) return res;
20
21        Queue<TreeNode> q = new LinkedList<>();
22        q.offer(root);
23
24        while (!q.isEmpty()) {
25            int n = q.size();
26            List<Integer> level = new ArrayList<>();
27
28            for (int i = 0; i < n; i++) {
29                TreeNode node = q.poll();
30                level.add(node.val);
31                
32                    if (node.left != null)
33                        q.offer(node.left);
34                    if (node.right != null)
35                        q.offer(node.right);
36            }
37            res.add(level.get(level.size() - 1));
38        }
39        return res;
40
41    }
42}