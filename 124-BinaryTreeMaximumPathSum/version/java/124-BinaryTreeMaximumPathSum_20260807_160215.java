// Last updated: 07/08/2026, 16:02:15
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10class Solution {
11    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
12        if(root == null || root == p || root == q) return root;
13
14        TreeNode left = lowestCommonAncestor(root.left, p, q);
15        TreeNode right = lowestCommonAncestor(root.right, p, q);
16
17        if(left != null && right != null) return root;
18
19        if(left == null) return right;
20        if(right == null) return left;
21
22        return root;
23
24
25
26    }
27}