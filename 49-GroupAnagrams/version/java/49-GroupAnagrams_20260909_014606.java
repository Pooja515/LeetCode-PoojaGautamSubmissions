// Last updated: 09/09/2026, 01:46:06
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        List<List<String>> ans = new ArrayList<>();
4        HashMap<String,List<String>> map = new HashMap<>();
5        for(String str:strs){
6            int[] freq = new int[26];
7
8            for(int i=0;i<str.length();i++){
9                freq[str.charAt(i) -'a']++;
10            }
11          
12            StringBuilder sb = new StringBuilder();
13            for(int num : freq){
14                sb.append(num);
15                sb.append('#');
16            }
17
18            String key = sb.toString();
19
20            map.putIfAbsent(key,new ArrayList<>());
21            map.get(key).add(str);
22        }
23
24        return new ArrayList<>(map.values());
25        
26    }
27}