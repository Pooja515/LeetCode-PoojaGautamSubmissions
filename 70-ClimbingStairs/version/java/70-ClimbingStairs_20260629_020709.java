// Last updated: 29/06/2026, 02:07:09
/*
 * Approach : using recursion , recurrance relation , f(n) = f(n-1) + f(n-2)
 * Time complexity : O(2^n)
 * Space Complexity: O(n)
*/

1class Solution {
2    public int fib(int n) {
3        if(n <= 1) return n;
4        return f(n);
5    }
6      int f(int n){
7        if(n <= 1) return n;
8
9        return f(n-1) + f(n-2);
10      }
11}