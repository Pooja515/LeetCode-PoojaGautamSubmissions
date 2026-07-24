// Last updated: 25/07/2026, 00:09:58
1class Solution {
2
3    public int networkDelayTime(int[][] times,int n,int k) {
4        // 1. Build directed adjacency list
5        List<List<int[]>> adj =
6                new ArrayList<>();
7
8        for (int i = 0; i <= n; i++) {
9            adj.add(new ArrayList<>());
10        }
11
12        for (int[] time : times) {
13
14            int source = time[0];
15
16            int destination =time[1];
17
18            int travelTime =time[2];
19
20            adj.get(source).add( new int[]{destination,travelTime});
21        }
22        // 2. Distance array
23        int[] distance = new int[n + 1];
24
25        Arrays.fill(distance,Integer.MAX_VALUE );
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
43            if (
44                    currentDistance
45                    >
46                    distance[currentNode]
47            ) {
48                continue;
49            }
50
51
52            for (int[] edge :adj.get(currentNode)) {
53
54                int neighbor =edge[0];
55
56                int weight =edge[1];
57
58
59                int newDistance =currentDistance+ weight;
60
61
62                if (newDistance < distance[neighbor]) {
63
64                    distance[neighbor] =newDistance;
65
66                    pq.offer(new int[]{newDistance,neighbor});
67                }
68            }
69        }
70        // 5. Find the time when everyone receives it
71    
72        int answer = 0;
73
74        for (int node = 1;node <= n;node++) {
75
76            if (distance[node] == Integer.MAX_VALUE) {
77                return -1;
78            }
79
80            answer = Math.max(answer,distance[node]);
81        }
82
83        return answer;
84    }
85}