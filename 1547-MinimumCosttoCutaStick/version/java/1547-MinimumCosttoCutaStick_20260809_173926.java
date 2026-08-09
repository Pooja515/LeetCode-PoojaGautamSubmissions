// Last updated: 09/08/2026, 17:39:26
1class Solution {
2
3    int[][] memo;
4
5    public int minCost(int n, int[] cuts) {
6
7        int m = cuts.length;
8
9        int[] arr = new int[m + 2];
10
11        arr[0] = 0;
12        arr[m + 1] = n;
13
14        for (int i = 0; i < m; i++) {
15            arr[i + 1] = cuts[i];
16        }
17
18        Arrays.sort(arr);
19
20        memo = new int[m + 2][m + 2];
21
22        for (int[] row : memo) {
23            Arrays.fill(row, -1);
24        }
25
26        return findMinimumCost(1, m, arr);
27    }
28
29    public int findMinimumCost(int i, int j, int[] cuts) {
30
31        if (i > j) {
32            return 0;
33        }
34
35        // Already calculated
36        if (memo[i][j] != -1) {
37            return memo[i][j];
38        }
39
40        int mini = (int) 1e9;
41
42        for (int ind = i; ind <= j; ind++) {
43
44            int cost = cuts[j + 1] - cuts[i - 1]
45                     + findMinimumCost(i, ind - 1, cuts)
46                     + findMinimumCost(ind + 1, j, cuts);
47
48            mini = Math.min(mini, cost);
49        }
50
51        return memo[i][j] = mini;
52    }
53}