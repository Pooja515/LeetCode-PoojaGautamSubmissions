// Last updated: 28/06/2026, 01:02:55
class Solution {
    int province=0;
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean[] visited =new boolean[n];
       for(int i=0;i<n;i++){
           if(!visited[i]){
            dfs(isConnected,i,visited);
            province++;
           }
       }
       return province;
    }
    void dfs(int[][] isConnected ,int i,boolean[] visited){
        visited[i]=true;
        for(int j=0;j<isConnected.length;j++){
            if(isConnected[i][j]==1 && !visited[j]){
                dfs(isConnected,j,visited);
            }
        }
    }
}