// Last updated: 28/10/2026, 01:04:44
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
20        return f(root) != -1;
21    }
22    int f(TreeNode root){
23
24        if(root == null) return 0;
25        
26        int lh = f(root.left) ;
27        if(lh == -1) return -1;
28
29        int rh =  f(root.right);
30        if(rh==-1) return -1;
31
32       if(Math.abs(rh-lh) > 1) return -1;
33
34        return 1 + Math.max(lh,rh);
35
36    }
37}