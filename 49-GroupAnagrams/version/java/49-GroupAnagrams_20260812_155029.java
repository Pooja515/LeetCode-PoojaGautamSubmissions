// Last updated: 12/08/2026, 15:50:29
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3      HashMap<String , List<String>> map = new HashMap<>();
4      for(String str : strs){
5        int n= str.length();
6        int[] freq = new int[26];
7
8        for(int i =0;i<n;i++){
9            freq[str.charAt(i)-'a']++;
10        }
11
12        StringBuilder sb = new StringBuilder();
13
14        for(int i=0;i<26;i++){
15            sb.append(freq[i]);
16            sb.append("#");
17        }
18        String key = sb.toString();
19        map.putIfAbsent(key,new ArrayList<>());
20        map.get(key).add(str);
21
22      }
23     return new ArrayList<>(map.values());
24    }
25}