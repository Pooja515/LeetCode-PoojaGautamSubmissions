// Last updated: 07/08/2026, 15:21:18
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
17    int maxsum=Integer.MIN_VALUE;
18    public int maxPathSum(TreeNode root) {
19        if(root == null) return 0;
20        maxPath(root);
21
22        return maxsum;
23    }
24
25    int  maxPath(TreeNode root){
26        if(root == null) return 0;
27        int l = maxPath(root.left);
28        int r = maxPath(root.right);
29
30        if(l<0) l=0;
31        if(r<0) r=0;
32
33        maxsum = Math.max(maxsum , root.val + l+ r);
34
35        return root.val + Math.max(l,r);
36
37    }
38}