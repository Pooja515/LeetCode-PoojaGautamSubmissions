// Last updated: 10/08/2026, 00:06:03
1class Solution {
2    int[] memo ;
3    public int minCut(String s) {
4        int n = s.length();
5        memo  = new int[n];
6        Arrays.fill(memo,-1);
7        return f(0, n, s) - 1 ;
8    }
9
10    boolean isPallindrome(int i, int j, String s) {
11        while (i < j) {
12            if (s.charAt(i) != s.charAt(j))  return false;
13            i++;
14            j--;
15        }
16        return true;
17    }
18    
19    int f(int i, int n, String s) {
20        if (i == n) return 0;
21        if(memo[i] != -1) return memo[i];
22        int mini = (int) 1e9;
23        for (int j = i; j < n; j++) {
24            if (isPallindrome(i, j, s)) {
25                int cost = 1 + f(j + 1, n, s);
26                mini = Math.min(mini, cost);
27            }
28        }
29
30        return memo[i] =mini;
31    }
32}