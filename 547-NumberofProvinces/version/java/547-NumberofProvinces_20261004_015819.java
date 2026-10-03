// Last updated: 04/10/2026, 01:58:19
1class Solution {
2    public int findCircleNum(int[][] isConnected) {
3        int n =  isConnected.length;
4        boolean[] visited = new boolean[n];
5        int province=0;
6
7        for(int i=0;i<n;i++){
8            if(!visited[i]){
9                dfs(i,isConnected,visited,n);
10                province++;
11            }
12        }
13        return province;
14
15    }
16    void dfs(int i,int[][] isConnected,boolean[] visited,int n){
17            visited[i] =true;
18                for(int j=0;j<n;j++){
19                    if(!visited[j] && isConnected[i][j] == 1){
20                        dfs(j,isConnected,visited,n);
21                    }
22                }
23            
24        }
25}