// Last updated: 29/07/2026, 15:00:08
1class Solution {
2    public int networkDelayTime(int[][] times, int n, int k) {
3
4        List<List<int[]>> adj = new ArrayList<>();
5
6        for(int i = 0; i<=n ; i++){
7            adj.add(new ArrayList<>());
8        }
9
10        for(int[] time : times){
11            int u = time[0];
12            int v = time[1];
13            int wt = time[2];
14
15            adj.get(u).add(new int[] {v,wt});
16
17        }
18
19        int[] distance = new int[n+1];
20        Arrays.fill(distance , (int) 1e9);
21        distance[k] =0;
22
23        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
24
25       //pair {distance ,src}
26        pq.offer(new int[] {0,k});
27
28        while(!pq.isEmpty()){
29            int[] curr = pq.poll();
30            int currdistance = curr[0];
31            int node = curr[1];
32            
33            if(currdistance > distance[node]) continue;
34
35
36            for(int[] neighbors : adj.get(node)){
37                int neighbor = neighbors[0];
38                int w = neighbors[1];
39
40                int newdistance = currdistance + w;
41                if(newdistance < distance[neighbor]){
42                    distance[neighbor] = newdistance;
43                    pq.offer(new int[] {newdistance , neighbor});
44                }
45            }
46        }
47
48        int maxi=0;
49        for(int i=1;i<=n;i++){
50            if(distance[i] == (int) 1e9 ){
51                return -1;
52            }
53            maxi = Math.max(maxi,distance[i]);
54        }
55        return maxi;
56
57    }
58}