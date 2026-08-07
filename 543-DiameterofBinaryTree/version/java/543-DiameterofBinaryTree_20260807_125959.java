// Last updated: 07/08/2026, 12:59:59
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
17    int diameter =0;
18    public int diameterOfBinaryTree(TreeNode root) {
19        
20        if(root == null) return 0;
21        depth(root);
22
23        return diameter; 
24    }
25    int depth(TreeNode root){
26        if(root == null) return 0;
27        int l = depth(root.left);
28        int r= depth(root.right);
29
30        diameter = Math.max(diameter,l+r);
31
32        return 1 + Math.max(l,r);
33    }
34}