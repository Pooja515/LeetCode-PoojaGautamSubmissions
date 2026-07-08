// Last updated: 08/07/2026, 15:39:50
1class Solution {
2    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
3         int n = rooms.size();
4         boolean[] visited = new boolean[n];
5        
6         dfs(0,rooms,visited,n);
7            
8         for(boolean vis : visited){
9            if(!vis) return false;
10         }
11         return true;
12    }
13    void dfs(int i, List<List<Integer>> rooms , boolean[] visited , int n){
14        visited[i] = true;
15        for(int nei : rooms.get(i)){
16            if(!visited[nei]){
17                dfs(nei,rooms,visited,n);
18            }
19        }
20    }
21}