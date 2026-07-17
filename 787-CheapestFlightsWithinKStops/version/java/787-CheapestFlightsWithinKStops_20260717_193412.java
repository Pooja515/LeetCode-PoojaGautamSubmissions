// Last updated: 17/07/2026, 19:34:12
1class Solution {
2    // Method to find the cheapest flight within K stops using BFS
3    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
4
5        // Create the adjacency list to represent airports and flights as a graph
6        List<List<int[]>> adj = new ArrayList<>();
7        for (int i = 0; i < n; i++) {
8            adj.add(new ArrayList<>());
9        }
10        
11        // Add edges for the flights to the adjacency list
12        for (int[] flight : flights) {
13            adj.get(flight[0]).add(new int[]{flight[1], flight[2]});
14        }
15
16        // Create a queue to store the node, its distance from the source, and the number of stops
17        Queue<int[]> q = new LinkedList<>();
18        q.offer(new int[]{0, src, 0});  // Push the source node with 0 stops and 0 cost
19
20        // Create a distance array to store the minimum cost to reach each node
21        int[] dist = new int[n];
22        Arrays.fill(dist, Integer.MAX_VALUE);
23        dist[src] = 0;
24
25        // BFS traversal with a queue to process the nodes
26        while (!q.isEmpty()) {
27            int[] current = q.poll();
28            int stops = current[0];  // Number of stops so far
29            int node = current[1];  // Current node
30            int cost = current[2];  // Cost to reach the current node
31
32            // If the number of stops exceeds K, continue to the next iteration
33            if (stops > K)
34                continue;
35
36            // Iterate over all the adjacent nodes (next destinations)
37            for (int[] adjNode : adj.get(node)) {
38                int nextNode = adjNode[0];  // Next destination node
39                int edW = adjNode[1];  // Cost of the flight to the next destination
40
41                // If a shorter path to the adjacent node is found, update the distance
42                if (cost + edW < dist[nextNode] && stops <= K) {
43                    dist[nextNode] = cost + edW;  // Update the distance
44                    q.offer(new int[]{stops + 1, nextNode, cost + edW});  // Push the new node with updated stops and cost
45                }
46            }
47        }
48
49        // If destination node is unreachable, return -1
50        if (dist[dst] == Integer.MAX_VALUE)
51            return -1;
52
53        return dist[dst];  // Return the minimum cost to reach the destination
54    }
55}