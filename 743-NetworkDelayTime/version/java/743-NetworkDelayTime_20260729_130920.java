// Last updated: 29/07/2026, 13:09:20
1class Solution {
2    public int networkDelayTime(int[][] times, int n, int k) {
3        List<List<int[]>> adj = new ArrayList<>();
4        for(int i =0 ;i <=n;i++){
5            adj.add(new ArrayList<>());
6        }
7
8        for(int[] time : times){
9            int u = time[0];
10            int v = time[1];
11            int wt = time[2];
12
13            adj.get(u).add(new int[] {v,wt});
14
15        }
16        int[] distance = new int[n+1];
17        Arrays.fill(distance,(int) 1e9);
18        distance[k] =0;
19
20        PriorityQueue<int[]> pq= new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
21
22        pq.offer(new int[] {0,k});
23
24        while(!pq.isEmpty()){
25            int[] curr = pq.poll();
26            int currDistance  = curr[0];
27            int node = curr[1];
28
29            if(currDistance > distance[node]) continue;
30
31            for(int[] neighbors : adj.get(node)){
32                int neighbor = neighbors[0];
33                int w = neighbors[1];
34
35                int newDistance = currDistance + w;
36
37                if(newDistance < distance[neighbor]){
38                    distance[neighbor] = newDistance;
39                    pq.offer(new int[] {newDistance , neighbor});
40                }
41            } 
42        }
43        int maxi =0;
44        for(int i =1 ;i <=n ;i++){
45          if(distance[i] == (int) 1e9) return -1;
46          maxi= Math.max(maxi,distance[i]);
47        }
48
49        return maxi;
50    }
51}