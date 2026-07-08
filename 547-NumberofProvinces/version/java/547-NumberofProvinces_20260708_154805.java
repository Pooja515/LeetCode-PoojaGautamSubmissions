// Last updated: 08/07/2026, 15:48:05
1class Solution {
2    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
3        int n=rooms.size();
4        boolean[] visited=new boolean[n];
5        dfs(0,visited,rooms);
6        for(int i=0;i<n;i++){
7            if(!visited[i]) return false;
8        }
9        return true;
10    }
11    void dfs(int node,boolean[] visited,List<List<Integer>> rooms){
12        visited[node]=true;
13        for(int neighbor: rooms.get(node)){
14            if(!visited[neighbor]) dfs(neighbor,visited,rooms);
15        }
16    }
17}