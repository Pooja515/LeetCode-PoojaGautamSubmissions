// Last updated: 06/08/2026, 16:50:22
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
28             if(sum > threshold) return false;
29        }
30        return true;
31    }
32}
33
34/** 
35    Binary search  based on answers:monotonic incr or monotonic decr
36
37    ==> Find the smallest divisor such that the result<=threshold==>take ceil value=7/3=3,10/2=5
38
39    1)As divisor incr,the sumdecr so, we need to find sum <= threshold
40
41    Find what shows monotonic behavior that is divisor,
42    As the divisor increases the sum decreases.So, minimum divisor and maximum divisor choose and do binary search
43    on that range to find the smalllest divisor less than  or equal to threshold
44
45    nums=[1,2,5,9]
46
47    mini=Integer.MAX_VALUE;
48    maxi=Integer.MIN_VALUE;
49
50    for(int i = 0;i<nums.length;i++)
51    {
52        mini = Math.min(mini, nums[i]);//1
53        maxi = Math.max(maxi, nums[i]);//9
54
55}
56This gives us divisor range from 1 to 9:
57minm divisor:1
58maximum divisor is:9
59
60basically positive integer divisor divide all the arrray by it, and
61the sum the division results
62*/