// Last updated: 06/08/2026, 17:50:18
1class Solution {
2    public int smallestDivisor(int[] nums, int threshold) {
3        int low = 1, high = 0;
4
5        for (int i = 0; i < nums.length; i++) {
6            high = Math.max(high, nums[i]);//9
7        }
8
9        while (low <= high) {
10            int mid = low + (high - low) / 2;
11            if (isPossible(nums, mid, threshold)) {
12            
13                high = mid - 1;
14
15            } else {
16                low = mid + 1;
17            }
18        }
19        return low;
20    }
21    boolean isPossible(int[] nums, int d,int threshold){
22        int sum =0;
23        for(int i=0;i<nums.length;i++){
24            sum +=nums[i]/d;
25            if(nums[i] % d != 0){
26                sum += 1;
27            }
28             if(sum > threshold) return false;//Early Termination This avoids unnecessary work once we already know the current divisor cannot be the answer.
29        }
30        return true;
31    }
32}
33