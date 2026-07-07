// Last updated: 07/07/2026, 21:22:35
1class Solution {
2    public int findCircleNum(int[][] isConnected) {
3        int n = isConnected.length;
4        boolean[] visited = new boolean[n];
5        int province = 0;
6        for(int i = 0;i<n;i++){
7             if(!visited[i]){
8                dfs(i,isConnected,visited,n);
9                province++;
10             }
11        }
12        return province;
13    }
14
15    void dfs(int i , int[][] isConnected , boolean[] visited , int n){
16        visited[i] = true;
17        for(int j = 0 ;j<n ;j++){
18            if(!visited[j] && isConnected[i][j] == 1){
19                dfs(j,isConnected,visited,n);
20            }
21        }
22    }
23}