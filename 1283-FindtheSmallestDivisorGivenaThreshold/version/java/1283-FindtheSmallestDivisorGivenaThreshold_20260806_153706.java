// Last updated: 06/08/2026, 15:37:06
1class Solution {
2    public int smallestDivisor(int[] nums, int threshold) {
3        int low = 1, high = 0, ans = 0;
4
5        for (int i = 0; i < nums.length; i++) {
6            high = Math.max(high, nums[i]);//9
7        }
8        ans = high;
9        while (low <= high) {
10            int mid = low + (high - low) / 2;
11            if (isValid(nums, mid, threshold)) {
12                ans = mid;
13                high = mid - 1;
14
15            } else {
16                low = mid + 1;
17            }
18        }
19        return ans;
20    }
21    boolean isValid(int[] nums, int d,int threshold){
22        int sum =0;
23        for(int i=0;i<nums.length;i++){
24            sum +=nums[i]/d;
25            if(nums[i] % d != 0){
26                sum += 1;
27            }
28        }
29        return sum <= threshold;
30    }
31}
32/** 
33    Binary search
34    based on answers:
35    monotonic incr
36    or monotonic decr
37
38    ==>
39    Find the
40    smallest divisor
41    such that
42    the result<=threshold==>
43    take ceil value=7/3=3,10/2=5
44
45    1)
46    As divisor incr,
47    the sum
48    decr so, we
49    need to
50    find sum<=
51    threshold
52
53Find
54    what shows
55    monotonic behavior
56    that is divisor,
57    As the
58    divisor increases
59    the sum decreases.So,
60    minimum divisor
61    and maximum
62    divisor choose and do
63    binary search
64    on that
65    range to
66    find the
67    smalllest divisor
68    less than
69    or equal
70    to threshold
71
72    nums=[1,2,5,9]mini=Integer.MAX_VALUE;maxi=Integer.MIN_VALUE;for(
73    int i = 0;i<nums.length;i++)
74    {
75        mini = Math.min(mini, nums[i]);//1
76        maxi = Math.max(maxi, nums[i]);//9
77
78}
79This gives
80us divisor
81range from 1 to 9:
82minm divisor:1
83maximum divisor is:9
84
85basically positive
86integer divisor
87divide all
88the arrray
89by it, and
90the sum
91the division
92results
93*/