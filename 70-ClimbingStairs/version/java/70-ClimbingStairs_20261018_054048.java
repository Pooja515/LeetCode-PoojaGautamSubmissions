// Last updated: 18/10/2026, 05:40:48
1class Solution {
2   public int climbStairs(int n) {
3       if (n <= 2)
4           return n;
5
6
7       int[] memo = new int[n + 1];
8       Arrays.fill(memo, -1);
9
10
11       return climb(n, memo);
12   }
13
14
15   int climb(int i, int[] memo) {
16       if (i <= 2)
17           return i;
18
19
20       if (memo[i] != -1)
21           return memo[i];
22
23
24       // Store the answer so each state is solved only once.
25       return memo[i] = climb(i - 1, memo) + climb(i - 2, memo);
26   }
27}
28