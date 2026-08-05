// Last updated: 05/08/2026, 13:12:55
1class Solution {
2    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
3        boolean[] visited = new boolean[rooms.size()];
4        dfs(0,visited,rooms);
5        for(int i=0;i<rooms.size();i++){
6            if(visited[i] == false) 
7                 return false;
8            }
9          return true;
10    }
11    void dfs(int node , boolean[] visited,List<List<Integer>> rooms){
12        visited[node] = true;
13        for(int neighbors : rooms.get(node)){
14            if(!visited[neighbors]){
15                dfs(neighbors,visited,rooms);
16            }
17        }
18    }
19  
20}