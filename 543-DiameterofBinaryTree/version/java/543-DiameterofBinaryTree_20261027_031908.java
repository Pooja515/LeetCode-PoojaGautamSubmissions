// Last updated: 27/10/2026, 03:19:08
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
17    int diameter = 0;
18
19    public int diameterOfBinaryTree(TreeNode root) {
20        if (root == null)
21            return 0;
22
23        f(root);
24
25        return diameter;
26    }
27
28    int f(TreeNode root) {
29         if (root == null)
30            return 0;
31
32        int lh = f(root.left);
33
34        int rh = f(root.right);
35
36        diameter = Math.max(diameter, lh + rh);
37
38        return 1 + Math.max(lh, rh);
39
40    }
41}