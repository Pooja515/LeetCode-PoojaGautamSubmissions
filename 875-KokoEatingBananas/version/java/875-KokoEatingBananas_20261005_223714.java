// Last updated: 05/10/2026, 22:37:14
1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3        int low=1,high = 1,ans=1;
4        for(int num:piles){
5            high = Math.max(high,num);
6        }
7        while(low<=high){
8            int mid = low+(high-low)/2;
9            if(isvalid(mid,piles,h)){
10                ans=mid;
11                high=mid-1;
12            }
13            else{
14                low=mid+1;
15            }
16        }
17        return ans;
18    }
19
20    boolean isvalid(int mid,int[] piles,int h){
21        int sum =0;
22        for(int num:piles){
23            sum+= num/mid;
24            if(num%mid !=0) sum+=1;
25            if(sum>h) return false;
26        }
27        return true;
28    }
29}