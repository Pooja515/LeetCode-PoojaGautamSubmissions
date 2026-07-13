// Last updated: 13/07/2026, 17:31:30
1class Solution {
2    public List<Integer> eventualSafeNodes(int[][] graph) {
3        int n = graph.length;
4        List<List<Integer>> reverseAdj = new ArrayList<>();
5        int[] outDegree = new int[n];
6
7        for (int i = 0; i < n; i++) {
8            reverseAdj.add(new ArrayList<>());
9        }
10
11        // Build reverse graph + track outdegree of original graph
12        for (int u = 0; u < n; u++) {
13            for (int v : graph[u]) {
14                reverseAdj.get(v).add(u); // reverse edge: v -> u
15            }
16            outDegree[u] = graph[u].length;
17        }
18
19        // Start with terminal nodes (outDegree == 0)
20        Queue<Integer> queue = new LinkedList<>();
21        boolean[] safe = new boolean[n];
22
23        for (int i = 0; i < n; i++) {
24            if (outDegree[i] == 0) {
25                queue.offer(i);
26            }
27        }
28
29        // Kahn's algorithm (propagate safety backward)
30        while (!queue.isEmpty()) {
31            int node = queue.poll();
32            safe[node] = true;
33
34            for (int pred : reverseAdj.get(node)) {
35                outDegree[pred]--;
36                if (outDegree[pred] == 0) {
37                    queue.offer(pred);
38                }
39            }
40        }
41
42        // Collect all safe nodes
43        List<Integer> result = new ArrayList<>();
44        for (int i = 0; i < n; i++) {
45            if (safe[i])
46                result.add(i);
47        }
48
49        return result;
50    }
51}