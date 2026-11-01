// Last updated: 02/11/2026, 03:43:40
1class Solution {
2    public String minWindow(String s, String t) {
3        int m = s.length() , n = t.length();
4        if(m<n || s== null || t== null) return "";
5
6        int[] freq = new int[128];
7
8        for(int i=0;i<n;i++){
9            char c = t.charAt(i);
10            freq[c]++;
11        }
12
13        int cnt = n ,l=0 ,minlen=Integer.MAX_VALUE , start=0;
14
15        for(int r=0;r<m;r++){
16            char c = s.charAt(r);
17            if(freq[c]>0){
18                cnt--;
19            }
20            freq[c]--;
21
22            while(cnt == 0){
23                if(r-l+1 <minlen){
24                    minlen = r-l+1;
25                    start=l;
26                }
27            
28                char left = s.charAt(l);
29                if(freq[left]>=0) cnt++;
30                freq[left]++;
31                l++;
32            }
33            
34
35        }
36       
37       return minlen == Integer.MAX_VALUE ? "" : s.substring(start, start + minlen);
38    }
39}