// Last updated: 13/09/2026, 03:13:10
1class Solution {
2    public boolean validPath(int n, int[][] edges, int source, int destination) {
3        List<List<Integer>> adj = new ArrayList<>();
4        boolean[] visited = new boolean[n];
5        for (int i = 0; i < n; i++) {
6            adj.add(new ArrayList<>());
7        }
8        for (int[] edge : edges) {
9            adj.get(edge[0]).add(edge[1]);
10            adj.get(edge[1]).add(edge[0]);
11        }
12
13        return dfs(source, destination, adj, visited);
14    }
15
16    boolean dfs(int source, int destination, List<List<Integer>> adj, boolean[] visited) {
17        if (source == destination)
18            return true;
19        visited[source] = true;
20        for (int neigh : adj.get(source)) {
21            if (!visited[neigh]) {
22                if (dfs(neigh, destination, adj, visited))
23                    return true;
24            }
25        }
26        return false;
27    }
28}