// Last updated: 05/08/2026, 11:46:16
1class Solution {
2    public boolean validPath(int n, int[][] edges, int source, int destination) {
3        List<List<Integer>> adj = new ArrayList<>();
4        boolean[] visited = new boolean[n];
5        for(int i=0; i<n; i++){
6            adj.add(new ArrayList<>());
7        }
8
9        for (int[] edge : edges) {
10            int u = edge[0];
11            int v = edge[1];
12            adj.get(u).add(v);
13            adj.get(v).add(u);
14        }
15        return dfs(source, visited, adj, destination);
16    }
17
18    boolean dfs(int source, boolean[] visited,List<List<Integer>> adj, int destination) {
19       
20        if (source == destination)
21             return true;
22
23        visited[source] = true;
24        for (int neighbor : adj.get(source)) {
25            if (!visited[neighbor]) {
26                if(dfs(neighbor, visited, adj, destination)){
27                    return true;
28                }
29            }
30        }
31        return false;
32    }
33
34}