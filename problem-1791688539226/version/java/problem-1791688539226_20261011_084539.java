// Last updated: 11/10/2026, 08:45:39
1import java.util.*;
2
3class Solution {
4    public List<Integer> maxPrimes(int n, int s) {
5        List<Integer> cur = new ArrayList<>();
6        int sum = 0;
7
8        for (int i = 2; i <= n; i++) {
9            if (isPrime(i)) {
10                if (sum + i > s) {
11                    break;
12                }
13
14                cur.add(i);
15                sum += i;
16            }
17        }
18
19        return cur;
20    }
21
22    private boolean isPrime(int num) {
23        if (num < 2) {
24            return false;
25        }
26
27        for (int i = 2; i * i <= num; i++) {
28            if (num % i == 0) {
29                return false;
30            }
31        }
32
33        return true;
34    }
35}