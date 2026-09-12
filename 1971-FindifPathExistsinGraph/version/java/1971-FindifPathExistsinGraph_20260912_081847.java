// Last updated: 12/09/2026, 08:18:47
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
16    boolean dfs(int node, int destination, List<List<Integer>> adj, boolean[] visited) {
17
18        if (node == destination)
19            return true;
20        visited[node] = true;
21        for (int neig : adj.get(node)) {
22            if (!visited[neig]) {
23                if (dfs(neig, destination, adj, visited))
24                    return true;
25            }
26
27        }
28        return false;
29    }
30}