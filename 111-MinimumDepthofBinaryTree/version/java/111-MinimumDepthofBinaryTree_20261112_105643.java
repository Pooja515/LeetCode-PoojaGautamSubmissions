// Last updated: 12/11/2026, 10:56:43
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
17    public int minDepth(TreeNode root) {
18        if(root == null) return 0;
19        if(root.left == null) return 1+ minDepth(root.right);
20        if(root.right == null) return 1+ minDepth(root.left);
21
22
23        int l= minDepth(root.left);
24        int r= minDepth(root.right);
25
26        return 1 + Math.min(l,r);
27    }
28}