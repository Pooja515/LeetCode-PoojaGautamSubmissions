// Last updated: 12/10/2026, 11:05:00
1class Solution {
2    public List<Integer> eventualSafeNodes(int[][] graph) {
3        int n = graph.length;
4        int[] state = new int[n];
5        List<Integer> result = new ArrayList<>();
6
7        // 0 = unvisited, 1 = visiting, 2 = safe, 3 = unsafe
8
9        for (int i = 0; i < n; i++) {
10            if (dfs(i, graph, state)) {
11                result.add(i);
12            }
13        }
14
15        // Nodes are checked in increasing order, so result is sorted.
16        return result;
17    }
18
19    private boolean dfs(int node, int[][] graph, int[] state) {
20        if (state[node] == 1) {
21            return false; // Cycle detected
22        }
23
24        if (state[node] == 2) {
25            return true; // Already known to be safe
26        }
27
28        if (state[node] == 3) {
29            return false; // Already known to be unsafe
30        }
31
32        state[node] = 1; // Mark as visiting
33
34        for (int neighbor : graph[node]) {
35            if (!dfs(neighbor, graph, state)) {
36                state[node] = 3; // One unsafe path makes node unsafe
37                return false;
38            }
39        }
40
41        state[node] = 2; // All paths lead to safe nodes
42        return true;
43    }
44}
45