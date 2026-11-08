// Last updated: 09/11/2026, 02:51:16
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) { 
3        List<List<String>> ans = new ArrayList<>();
4        HashMap<String,List<String>> map = new HashMap<>();
5
6        for(String s:strs){
7            int[] freq=new int[26];
8            for(int i=0;i<s.length();i++){
9                freq[s.charAt(i)-'a']++;
10            }
11
12            StringBuilder str = new StringBuilder();
13            for(int n:freq){
14                str.append(n);
15                str.append('#');
16            }
17
18            String key = str.toString();
19
20            if(!map.containsKey(key)){
21                 map.put(key,new ArrayList<>());
22            }
23            map.get(key).add(s);
24        
25            // map.putIfAbsent(key,new ArrayList<>());
26          //  map.get(key).add(s);
27        }  
28
29        return new ArrayList<>(map.values());
30    }
31}