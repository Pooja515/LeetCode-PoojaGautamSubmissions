// Last updated: 18/09/2026, 01:57:07
1class Solution {
2    public int networkDelayTime(int[][] times, int n, int k) {
3        List<List<int[]>> adj = new ArrayList<>();
4
5        for(int i=0;i<=n;i++){
6            adj.add(new ArrayList<>());
7        }
8
9        for(int[] time:times){
10            int u=time[0];
11            int v=time[1];
12            int t=time[2];
13
14            adj.get(u).add(new int[] {v,t});
15           // adj.get(v).add(new int[] {u,t});
16        }
17
18        int[] traveltime = new int[n+1];
19        Arrays.fill(traveltime,Integer.MAX_VALUE);
20
21        traveltime[k]=0;
22
23        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> Integer.compare(a[0],b[0]));
24        pq.offer(new int[] {0,k});
25
26        while(!pq.isEmpty()){
27            int[] cur = pq.poll();
28            int time = cur[0];
29            int node = cur[1];
30
31            if(time > traveltime[node]) continue;
32
33            for(int[] edge: adj.get(node) ){
34                int neighbor = edge[0];
35                int tt = edge[1];
36
37                int newtime = time +tt;
38                if(newtime < traveltime[neighbor]){
39                    traveltime[neighbor] = newtime;
40                    pq.offer(new int[] {newtime,neighbor});
41                }
42            }
43        }
44        int maxtime=0;
45        for(int i=1 ;i<=n;i++){
46            if(traveltime[i] == Integer.MAX_VALUE) return -1;
47            maxtime=Math.max(maxtime,traveltime[i]);
48
49        }
50        return maxtime;
51    }
52}