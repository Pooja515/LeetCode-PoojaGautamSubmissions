// Last updated: 26/07/2026, 00:47:28
1class Solution {
2
3    public int networkDelayTime(int[][] times,int n,int k) {
4        // 1. Build directed adjacency list
5        List<List<int[]>> adj = new ArrayList<>();
6
7        for (int i = 0; i <= n; i++) {
8            adj.add(new ArrayList<>());
9        }
10
11        for (int[] time : times) {
12
13            int source = time[0];
14
15            int destination =time[1];
16
17            int travelTime =time[2];
18
19            adj.get(source).add( new int[]{destination,travelTime});
20        }
21        // 2. Distance array
22        int[] distance = new int[n + 1];
23
24        Arrays.fill(distance,Integer.MAX_VALUE );
25
26        distance[k] = 0;
27        // 3. Min-heap
28        // {distance, node}
29        PriorityQueue<int[]> pq =new PriorityQueue<>((a, b) ->Integer.compare(a[0],b[0]));
30
31        pq.offer(new int[]{0,k});
32        // 4. Dijkstra
33
34        while (!pq.isEmpty()) {
35
36            int[] current =pq.poll();
37
38            int currentDistance =current[0];
39
40            int currentNode =current[1];
41
42
43            if (currentDistance > distance[currentNode]) {
44                continue;
45            }
46
47
48            for (int[] edge :adj.get(currentNode)) {
49
50                int neighbor =edge[0];
51
52                int weight =edge[1];
53
54
55                int newDistance =currentDistance+ weight;
56
57
58                if (newDistance < distance[neighbor]) {
59
60                    distance[neighbor] =newDistance;
61
62                    pq.offer(new int[]{newDistance,neighbor});
63                }
64            }
65        }
66        // 5. Find the time when everyone receives it
67    
68        int answer = 0;
69
70        for (int node = 1;node <= n;node++) {
71
72            if (distance[node] == Integer.MAX_VALUE) {
73                return -1;
74            }
75
76            answer = Math.max(answer,distance[node]);
77        }
78
79        return answer;
80    }
81}