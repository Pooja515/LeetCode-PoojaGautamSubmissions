// Last updated: 13/11/2026, 22:53:54
1class Solution {
2    public boolean canFinish(int numCourses, int[][] prerequisites) {
3        List<List<Integer>> adj = new ArrayList<>();
4
5        for (int i = 0; i < numCourses; i++) {
6            adj.add(new ArrayList<>());
7        }
8
9        int[] indegree = new int[numCourses];
10
11        for (int[] edge : prerequisites) {
12            int u = edge[0];
13            int v = edge[1];
14            adj.get(v).add(u);
15            indegree[u]++;
16        }
17
18        Queue<Integer> q = new LinkedList<>();
19
20        for (int i = 0; i < numCourses; i++) {
21            if (indegree[i] == 0) {
22                q.offer(i);
23            }
24        }
25        int ind = 0;
26        while (!q.isEmpty()) {
27            int node = q.poll();
28            ind++;
29            for (int neigh : adj.get(node)) {
30                indegree[neigh]--;
31                if (indegree[neigh] == 0) {
32                    q.offer(neigh);
33                }
34            }
35            if (ind == numCourses)
36                return true;
37        }
38        return false;
39
40    }
41}