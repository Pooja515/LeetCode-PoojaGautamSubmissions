// Last updated: 05/08/2026, 14:56:31
1class Solution {
2    public int findCircleNum(int[][] isConnected) {
3        int m = isConnected.length;
4
5        boolean[] visited = new boolean[m];
6        int province =0;
7        for(int i=0;i<m;i++){
8            if(!visited[i]){
9                dfs(i,visited,isConnected);
10                province++;
11            }
12        }
13        return province;
14    }
15
16    void dfs(int city ,boolean[] visited , int[][] isConnected){
17        visited[city]=true;
18        for(int j=0;j<isConnected.length;j++){
19            if(isConnected[city][j]==1 && !visited[j]){
20                dfs(j,visited,isConnected);
21            }
22        }
23    }
24}