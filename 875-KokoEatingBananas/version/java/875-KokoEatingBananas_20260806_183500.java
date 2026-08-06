// Last updated: 06/08/2026, 18:35:00
1class Solution {
2    public int shipWithinDays(int[] weights, int days) {
3        int low=0,high=0;
4
5        for(int i=0;i<weights.length;i++){
6            low=Math.max(low,weights[i]);
7            high+=weights[i];
8        }
9
10  
11        while(low<=high){
12            int mid=low+(high-low)/2;
13            if(capacity(weights,mid,days)){
14              
15                high=mid-1;
16            }
17            else
18                  low=mid+1;
19        }
20        return low;
21    }
22
23    boolean capacity(int[] weights,int mid,int days){
24        int sum=0,cnt=1;
25        for(int i=0;i<weights.length;i++){
26            sum+=weights[i];
27            if(sum>mid){
28                sum=weights[i];
29                cnt++;
30            }
31        }
32        return cnt<=days;
33    }
34}