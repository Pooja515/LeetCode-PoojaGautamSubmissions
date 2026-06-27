// Last updated: 28/06/2026, 01:02:08

class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int l=0,sum=0,cnt=0;
        for(int r=0;r<arr.length;r++){
            sum+=arr[r];
            if((r-l+1)==k){
                if(sum>=threshold*k)
                     cnt++;
                 sum-=arr[l];
                 l++;
            }
        }
        return cnt;
    }
}