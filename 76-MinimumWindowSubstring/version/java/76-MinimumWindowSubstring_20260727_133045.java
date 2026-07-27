// Last updated: 27/07/2026, 13:30:45
1class Solution {
2    public String minWindow(String s, String t) {
3        int m=s.length(),n=t.length();
4        if(m<n) return "";
5        int[] freq=new int[128];
6        for(char c:t.toCharArray()){
7            freq[c]++;
8        }
9        int l=0,cnt=n,minlen=Integer.MAX_VALUE,start=0;
10        for(int r=0;r<m;r++){
11            char c=s.charAt(r);
12            if(freq[c]>0){
13                cnt--;
14            }
15             freq[c]--;
16             while(cnt==0){
17                if(r-l+1<minlen){
18                    minlen=r-l+1;
19                    start=l;
20                }
21                char left=s.charAt(l);
22                freq[left]++;
23
24                if(freq[left]>0)
25                       cnt++;
26                l++;
27             }   
28            
29        }
30        return minlen==Integer.MAX_VALUE?"":s.substring(start,start+minlen);
31    }
32}