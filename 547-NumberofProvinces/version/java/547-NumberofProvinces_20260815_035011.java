// Last updated: 15/08/2026, 03:50:11
1class Solution {
2    public int findCircleNum(int[][] isConnected) {
3       int n= isConnected.length;
4       boolean[] visited = new boolean[n];
5       int province =0;
6
7       for(int i=0;i<n;i++){
8          if(!visited[i]){
9            dfs(i,isConnected,visited);
10            province++;
11          }
12       }
13       return province;
14    }
15
16    void dfs(int i ,int[][] isConnected,boolean[] visited ){
17        visited[i] = true;
18        for(int j=0; j<isConnected.length; j++){
19            if(isConnected[i][j] == 1 && !visited[j]){
20                dfs(j,isConnected,visited);
21            }
22        }
23    }
24}