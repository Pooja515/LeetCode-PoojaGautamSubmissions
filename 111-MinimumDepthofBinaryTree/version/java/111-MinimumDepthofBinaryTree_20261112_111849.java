// Last updated: 12/11/2026, 11:18:49
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
18
19        // Base case
20        if (root == null) {
21            return 0;
22        }
23
24        // If left child is missing, go right
25        if (root.left == null) {
26            return 1 + minDepth(root.right);
27        }
28
29        // If right child is missing, go left
30        if (root.right == null) {
31            return 1 + minDepth(root.left);
32        }
33
34        // Both children exist
35        return 1 + Math.min(
36            minDepth(root.left),
37            minDepth(root.right)
38        );
39    }
40}