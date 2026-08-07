// Last updated: 07/08/2026, 17:47:08
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
17
18    int longestPath = 0;
19
20    public int longestUnivaluePath(TreeNode root) {
21        if (root == null) {
22            return 0;
23        }
24
25        dfs(root);
26
27        return longestPath;
28    }
29
30    private int dfs(TreeNode root) {
31
32        if (root == null) {
33            return 0;
34        }
35
36        int left = dfs(root.left);
37        int right = dfs(root.right);
38
39        if (root.left != null && root.left.val == root.val) {
40            left++;
41        } else {
42            left = 0;
43        }
44
45        if (root.right != null && root.right.val == root.val) {
46            right++;
47        } else {
48            right = 0;
49        }
50
51        longestPath = Math.max(longestPath,left + right);
52
53        return Math.max(left, right);
54    }
55}
56