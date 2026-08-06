// Last updated: 07/08/2026, 02:18:26
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
17    public boolean isBalanced(TreeNode root) {
18        if(root == null) return true;
19        
20        return height(root) == -1 ? false:true;
21    }
22    int height(TreeNode root){
23        if(root == null) return 0;
24
25        int l = height(root.left);
26        if(l==-1) return -1;
27     
28        int r = height(root.right);
29        if(r==-1) return -1;
30      
31
32        if (Math.abs(l-r) >1) return -1;
33        return 1+ Math.max(l,r);
34    }
35}