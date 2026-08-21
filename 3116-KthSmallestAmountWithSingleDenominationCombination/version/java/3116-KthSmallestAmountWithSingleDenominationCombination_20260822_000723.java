// Last updated: 22/08/2026, 00:07:23
1class Solution {
2
3    public long findKthSmallest(int[] coins, int k) {
4
5        long low = 1;
6        long high = (long) coins[0] * k;
7
8        while (low < high) {
9
10            long mid = low + (high - low) / 2;
11
12            long count = countNumbers(mid, coins);
13
14            if (count >= k) {
15                high = mid;
16            } else {
17                low = mid + 1;
18            }
19        }
20
21        return low;
22    }
23
24    private long countNumbers(long x, int[] coins) {
25
26        long count = 0;
27        int n = coins.length;
28
29        // Every non-empty subset of coins
30        for (int mask = 1; mask < (1 << n); mask++) {
31
32            long lcm = 1;
33            int bits = 0;
34            boolean valid = true;
35
36            for (int i = 0; i < n; i++) {
37
38                if ((mask & (1 << i)) != 0) {
39
40                    bits++;
41
42                    long gcd = gcd(lcm, coins[i]);
43
44                    lcm = lcm / gcd * coins[i];
45
46                    // LCM is bigger than x,
47                    // so it contributes nothing.
48                    if (lcm > x) {
49                        valid = false;
50                        break;
51                    }
52                }
53            }
54
55            if (!valid) {
56                continue;
57            }
58
59            long contribution = x / lcm;
60
61            if (bits % 2 == 1) {
62                count += contribution;
63            } else {
64                count -= contribution;
65            }
66        }
67
68        return count;
69    }
70
71    private long gcd(long a, long b) {
72
73        while (b != 0) {
74            long temp = a % b;
75            a = b;
76            b = temp;
77        }
78
79        return a;
80    }
81}