// Last updated: 28/06/2026, 01:03:09
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       List<Integer> ans=new ArrayList<>();
        int[] freq=new int[26];
        int n=s.length(),m=p.length();
        int l=0;
        if(n<m) return ans;
        for(int i=0;i<m;i++){
            char c=p.charAt(i);
            freq[c-'a']++;
        }
        int cnt=m;
        for(int r=0;r<n;r++){
          char c= s.charAt(r);
          if(freq[c-'a']>0){
                  cnt--;
          }
          freq[c-'a']--;
          if(cnt==0){
            ans.add(l);
          }
          if(r-l+1 ==m){
             char left=s.charAt(l);
             if(freq[left-'a']>=0){
                cnt++;
             }
             freq[left-'a']++;
             l++;
          }
        }
        return ans;
    }
}