// Last updated: 13/09/2026, 06:30:39
1class Solution {
2   public int findCircleNum(int[][] isConnected) {
3       int n = isConnected.length;
4       boolean visited[] = new boolean[n];
5       int province = 0;
6       for(int i = 0 ;i<n ;i++){
7           if(!visited[i]){
8               province++;
9               Queue<Integer> q = new ArrayDeque<>();
10               q.offer(i);
11               visited[i] = true;
12               while(!q.isEmpty()){
13                   int node = q.poll();
14                   for(int nei =0;nei<n;nei++){
15                       if(isConnected[node][nei] == 1 && !visited[nei]){
16                           visited[nei] = true;
17                           q.offer(nei);
18                       }
19                   }
20               }
21           }
22       }
23       return province;
24   }
25}
26