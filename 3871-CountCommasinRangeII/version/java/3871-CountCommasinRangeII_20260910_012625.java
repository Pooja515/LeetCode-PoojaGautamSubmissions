// Last updated: 10/09/2026, 01:26:25
1class Solution {
2    public long countCommas(long n) {
3      long p = 1000, res = 0;
4        while (p <= n) {
5            res += n - p + 1;
6            p *= 1000;
7        }
8        return res;  
9    }
10}
11