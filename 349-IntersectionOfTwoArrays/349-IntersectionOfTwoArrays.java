// Last updated: 28/06/2026, 01:03:15
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> s=new HashSet<>();
    HashSet<Integer> res=new HashSet<>();
    for(int n:nums1){
        s.add(n);
    }
    for(int n:nums2){
        if(s.contains(n)) res.add(n);
    }
    int[] ans=new int[res.size()];
    int i=0;
    for(int n:res){
        ans[i++]=n;
    }
    return ans;
    }
}