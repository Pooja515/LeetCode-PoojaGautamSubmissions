// Last updated: 12/08/2026, 18:16:03
1class Solution {
2    public int maxSubarraySumCircular(int[] nums) {
3        int totalsum=0,currmaxsum =0,currminsum=0;
4        int maxi= Integer.MIN_VALUE , mini = Integer.MAX_VALUE;
5
6        for(int num : nums){
7            totalsum += num;
8            currmaxsum += num;
9            currminsum += num;
10
11            maxi= Math.max(maxi,currmaxsum);
12
13            if(currmaxsum < 0){
14                currmaxsum = 0;
15            }
16
17            mini = Math.min(mini,currminsum);
18
19
20            if(currminsum > 0){
21                currminsum = 0;
22            }
23
24        }
25
26        if(maxi < 0) return maxi;
27        int circularsum = totalsum - mini;
28
29        return Math.max(maxi,circularsum);
30    }
31}