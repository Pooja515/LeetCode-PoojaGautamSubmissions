// Last updated: 13/09/2026, 05:42:26
1class Solution {
2    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
3        boolean[] visited = new boolean[rooms.size()];
4
5        dfs(0, rooms, visited);
6        for (boolean num : visited) {
7            if (!num)
8                return false;
9        }
10        return true;
11    }
12
13    void dfs(int node, List<List<Integer>> rooms, boolean[] visited) {
14        visited[node] = true;
15        for (int neigh : rooms.get(node)) {
16            if (!visited[neigh])
17                dfs(neigh, rooms, visited);
18        }
19    }
20}