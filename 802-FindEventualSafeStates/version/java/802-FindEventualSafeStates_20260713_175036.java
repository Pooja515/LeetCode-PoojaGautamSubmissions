// Last updated: 13/07/2026, 17:50:36
1class Solution {
2    public List<Integer> eventualSafeNodes(int[][] graph) {
3        int n = graph.length;
4        List<List<Integer>> adj = new ArrayList<>();
5        int[] outDegree = new int[n];
6
7        for (int i = 0; i < n; i++) {
8            adj.add(new ArrayList<>());
9        }
10
11        //Nested loop + build REVERSE graph
12        for (int u = 0; u < n; u++) {
13            for (int v : graph[u]) {
14                adj.get(v).add(u);     // reverse edge: v -> u
15            }
16            outDegree[u] = graph[u].length;  // outdegree from ORIGINAL graph
17        }
18
19        Queue<Integer> queue = new LinkedList<>();
20        boolean[] safe = new boolean[n];
21
22        for (int i = 0; i < n; i++) {
23            if (outDegree[i] == 0) {
24                queue.offer(i);
25            }
26        }
27
28        while (!queue.isEmpty()) {
29            int node = queue.poll();
30            safe[node] = true;
31
32            for (int neighbour : adj.get(node)) {  // predecessors now
33                outDegree[neighbour]--;
34                if (outDegree[neighbour] == 0) {
35                    queue.offer(neighbour);
36                }
37            }
38        }
39
40        List<Integer> result = new ArrayList<>();
41        for (int i = 0; i < n; i++) {
42            if (safe[i]) result.add(i);
43        }
44
45        return result;
46    }
47}