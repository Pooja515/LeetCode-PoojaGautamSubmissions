// Last updated: 29/06/2026, 02:18:44
/*
 * Approach : Memoization -DP , resolving subproblems by storing result in memo array , hence it optimizes Time complexity from O(2^N) to O(N) i.e from recursion to memoization approach.
 * 
 * Space Complexity : O(N) +O(N) = O(2N) = > O(N) 
 * O(N) // for memo array to store results 
 * O(N) // recusive call stack depth
*/

1class Solution {
2    public int fib(int n) {
3        if(n <= 1) return n;
4        
5        int[] memo = new int[n+1];
6        Arrays.fill(memo , -1);
7
8        return f(n , memo);
9    }
10      int f(int n , int[] memo){
11        if(n <= 1) return n;
12
13        if(memo[n] != -1) return memo[n];
14
15        return memo[n] = f(n-1,memo) + f(n-2,memo);
16      }
17}