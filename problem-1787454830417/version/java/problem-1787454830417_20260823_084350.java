// Last updated: 23/08/2026, 08:43:50
1class Solution {
2     private List<Integer> getPrimeFactors(int num) {
3
4        List<Integer> factors = new ArrayList<>();
5
6        for (int i = 2; i * i <= num; i++) {
7            if (num % i == 0) {
8                factors.add(i);
9                while (num % i == 0) {
10                    num /= i;
11                }
12            }
13        }
14
15        if (num > 1) {
16            factors.add(num);
17        }
18
19        return factors;
20    }
21
22    public int longestSubarray(int[] nums, int k) {
23        int n = nums.length;
24
25        List<Integer>[] factors = new ArrayList[n];
26
27        for (int i = 0; i < n; i++) {
28            factors[i] = getPrimeFactors(nums[i]);
29        }
30
31        // Frequency of each prime
32        int[] freq = new int[100001];
33
34        int left = 0;
35        int distinct = 0;
36        int answer = 0;
37
38        for (int right = 0; right < n; right++) {
39
40            for (int prime : factors[right]) {
41
42                if (freq[prime] == 0) {
43                    distinct++;
44                }
45
46                freq[prime]++;
47            }
48
49            while (distinct > k) {
50                for (int prime : factors[left]) {
51
52                    freq[prime]--;
53
54                    if (freq[prime] == 0) {
55                        distinct--;
56                    }
57                }
58
59                left++;
60            }
61            answer = Math.max(answer, right - left + 1);
62        }
63
64        return answer;
65    }
66}