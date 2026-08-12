// Last updated: 13/08/2026, 02:02:24
1class Solution {
2    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
3        int n = rooms.size();
4
5        boolean[] visited = new boolean[n];
6
7        dfs(0,rooms , visited);
8
9        for(int i =0;i<n;i++){
10            if(!visited[i]) return false;
11        }
12        return true;
13
14    }
15    void dfs(int i,List<List<Integer>> rooms,boolean[] visited){
16        visited[i] = true;
17        for(int neighbors :rooms.get(i)){
18            if(!visited[neighbors]) dfs(neighbors,rooms,visited);
19        }
20    }
21}