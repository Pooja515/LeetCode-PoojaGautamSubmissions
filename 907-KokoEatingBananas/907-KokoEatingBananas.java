// Last updated: 28/06/2026, 01:02:32
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1,high=0;
        for(int i=0;i<piles.length;i++){
           
            high=Math.max(high,piles[i]);
        }
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isvalid(piles,mid,h)){
                ans=mid;
                high=mid-1;
            }
            else
                   low=mid+1;
        }
        return ans;
    }
    boolean isvalid(int[] piles,int mid,int h){
        long sum=0;
        for(int i=0;i<piles.length;i++){
            sum+=(piles[i])/mid;
            if(piles[i]%mid !=0)
                  sum++;  
           
        }
        return sum<=h;
    }
}