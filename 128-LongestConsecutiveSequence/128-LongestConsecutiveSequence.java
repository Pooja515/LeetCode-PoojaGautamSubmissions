// Last updated: 28/06/2026, 01:04:18
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n= nums.length;
        if(n==0 || nums == null) return 0;
        for(int i=0 ; i<n ; i++){
            set.add(nums[i]);
        }
        int longest =0;
        for(int num: set){
            if(!set.contains(num-1)){
                int cnt =1;
                int x = num;
                while(set.contains(x+1)){
                    cnt++;
                    x=x+1;
                }
                longest = Math.max(longest,cnt);
            }
        }
        return longest;
        
    }
}