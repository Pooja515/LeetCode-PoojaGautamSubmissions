// Last updated: 30/07/2026, 12:03:31
1class Solution {
2    
3    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
4
5     
6        List<List<int[]>> adj = new ArrayList<>();
7        for (int i = 0; i < n; i++) {
8            adj.add(new ArrayList<>());
9        }
10        
11        for (int[] flight : flights) {
12            adj.get(flight[0]).add(new int[]{flight[1], flight[2]});
13        }
14
15        Queue<int[]> q = new LinkedList<>();
16        q.offer(new int[]{0, src, 0});  
17
18        int[] distance = new int[n];
19        Arrays.fill(distance, (int) 1e9);
20        distance[src] = 0;
21
22        while (!q.isEmpty()) {
23            int[] current = q.poll();
24            int stops = current[0];  // Number of stops so far
25            int node = current[1];  // Current node
26            int currcost = current[2];  // Cost to reach the current node
27
28            // If the number of stops exceeds K, continue to the next iteration
29            if (stops > K)
30                continue;
31
32            // Iterate over all the adjacent nodes (next destinations)
33            for (int[] adjNode : adj.get(node)) {
34                int neighborNode = adjNode[0];  // neighborNode node
35                int wt = adjNode[1];  // Cost of the flight to the next destination
36
37                // If a shorter path to the adjacent node is found, update the distance
38                int newdistance= currcost + wt ; 
39                if (newdistance < distance[neighborNode] && stops <= K) {
40                    distance[neighborNode] = newdistance;  // Update the distance
41                    q.offer(new int[]{stops + 1, neighborNode, newdistance}); 
42                }
43            }
44        }
45
46        // If destination node is unreachable, return -1
47        if (distance[dst] == (int) 1e9)
48            return -1;
49
50        return distance[dst];  // Return the minimum cost to reach the destination
51    }
52}