// Last updated: 28/06/2026, 01:02:34
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean[] visited=new boolean[n];
        dfs(0,visited,rooms);
        for(int i=0;i<n;i++){
            if(!visited[i]) return false;
        }
        return true;
    }
    void dfs(int node,boolean[] visited,List<List<Integer>> rooms){
        if(!visited[node])
            visited[node]=true;
        for(int neighbor: rooms.get(node)){
            if(!visited[neighbor]) dfs(neighbor,visited,rooms);
        }
    }
}