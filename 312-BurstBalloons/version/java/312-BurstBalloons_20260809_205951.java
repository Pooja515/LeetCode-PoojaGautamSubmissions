// Last updated: 09/08/2026, 20:59:51
1class Solution {
2    int[][] memo;
3    public int maxCoins(int[] nums) {
4        int m = nums.length;
5        int[] arr = new int[m + 2];
6        arr[0] = 1;
7        arr[m + 1] = 1;
8        for (int i = 0; i < m; i++) {
9            arr[i + 1] = nums[i];
10        }
11         memo = new int[m + 2][m + 2];
12         for (int[] row : memo) {
13            Arrays.fill(row, -1);
14        }
15
16
17        return f(1, m, arr);
18    }
19
20    int f(int i ,int j ,int[] nums){
21        if(i>j) return 0;
22        int maxi = Integer.MIN_VALUE;
23        if (memo[i][j] != -1) {
24            return memo[i][j];
25        }
26
27        for(int ind =i;ind <= j ;ind++){
28            int cost = nums[i-1] * nums[ind] * nums[j+1] + f(i,ind-1,nums) + f(ind+1,j,nums);
29            maxi = Math.max(maxi, cost);
30
31        }
32        return memo[i][j] = maxi;
33    }
34}