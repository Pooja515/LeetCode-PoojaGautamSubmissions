// Last updated: 28/06/2026, 01:01:55
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj =new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        boolean[] visited =new boolean[n];
        return dfs(source,destination,adj,visited);
    }

    boolean dfs(int source,int destination,List<List<Integer>> adj, boolean[] visited){
        if(source == destination) return true;
        visited[source]=true;
        for(int neighbor:adj.get(source)){
            if(!visited[neighbor]){
                if(dfs(neighbor,destination,adj,visited)) return true;
            }
        }
        return false;
    }
}