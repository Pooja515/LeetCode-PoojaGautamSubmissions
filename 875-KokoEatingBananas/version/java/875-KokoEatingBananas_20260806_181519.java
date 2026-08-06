// Last updated: 06/08/2026, 18:15:19
1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3        int low = 1,high = 0;
4
5        for(int i=0;i<piles.length;i++){
6           
7            high = Math.max(high,piles[i]);
8
9        }
10    
11        while(low <= high){
12            int mid = low+(high-low)/2;
13
14            if(isPossible(piles,mid,h)){
15                high=mid-1;
16            }
17            else
18                   low=mid+1;
19        }
20        return low;
21    }
22    boolean isPossible(int[] piles,int mid,int h){
23        long sum=0;
24        for(int i=0;i<piles.length;i++){
25            sum+=(piles[i])/mid;
26            if(piles[i]%mid !=0)
27                  sum++;  
28           if(sum > h) return false;
29        }
30        return true;
31    }
32}