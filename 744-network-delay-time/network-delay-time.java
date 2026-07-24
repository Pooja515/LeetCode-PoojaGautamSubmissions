class Solution {

    public int networkDelayTime(int[][] times,int n,int k) {
        // 1. Build directed adjacency list
        List<List<int[]>> adj =
                new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] time : times) {

            int source = time[0];

            int destination =time[1];

            int travelTime =time[2];

            adj.get(source).add( new int[]{destination,travelTime});
        }
        // 2. Distance array
        int[] distance = new int[n + 1];

        Arrays.fill(distance,Integer.MAX_VALUE );
        distance[k] = 0;
        // 3. Min-heap
        // {distance, node}
        PriorityQueue<int[]> pq =new PriorityQueue<>((a, b) ->Integer.compare(a[0],b[0]));

        pq.offer(new int[]{0,k});
        // 4. Dijkstra

        while (!pq.isEmpty()) {

            int[] current =pq.poll();

            int currentDistance =current[0];

            int currentNode =current[1];


            if (
                    currentDistance
                    >
                    distance[currentNode]
            ) {
                continue;
            }


            for (int[] edge :adj.get(currentNode)) {

                int neighbor =edge[0];

                int weight =edge[1];


                int newDistance =currentDistance+ weight;


                if (newDistance < distance[neighbor]) {

                    distance[neighbor] =newDistance;

                    pq.offer(new int[]{newDistance,neighbor});
                }
            }
        }
        // 5. Find the time when everyone receives it
    
        int answer = 0;

        for (int node = 1;node <= n;node++) {

            if (distance[node] == Integer.MAX_VALUE) {
                return -1;
            }

            answer = Math.max(answer,distance[node]);
        }

        return answer;
    }
}