// Last updated: 23/08/2026, 01:21:05
1class Solution {
2    public boolean checkDivisibility(int n) {
3
4        int original = n;
5
6        int sum = 0;
7        int product = 1;
8
9        while (n > 0) {
10
11            int digit = n % 10;
12
13            sum += digit;
14            product *= digit;
15
16            n /= 10;
17        }
18
19        return original % (sum + product) == 0;
20    }
21}