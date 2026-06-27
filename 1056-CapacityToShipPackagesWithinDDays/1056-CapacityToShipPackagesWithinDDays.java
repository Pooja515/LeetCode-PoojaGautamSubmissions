// Last updated: 28/06/2026, 01:02:15
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0,high=0;
        for(int i=0;i<weights.length;i++){
            low=Math.max(low,weights[i]);
            high+=weights[i];
        }
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(capacity(weights,mid,days)){
                ans=mid;
                high=mid-1;
            }
            else
                  low=mid+1;
        }
        return ans;
    }

    boolean capacity(int[] weights,int mid,int days){
        int sum=0,cnt=1;
        for(int i=0;i<weights.length;i++){
            sum+=weights[i];
            if(sum>mid){
                sum=weights[i];
                cnt++;
            }
        }
        return cnt<=days;
    }
}