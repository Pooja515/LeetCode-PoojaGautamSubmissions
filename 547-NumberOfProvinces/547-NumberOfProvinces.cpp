// Last updated: 28/06/2026, 01:02:59
class Solution {
private:
    void dfs(int node,vector<int> adjlist[],vector<int> &vis)
    {
        vis[node]=1;
        for(auto it : adjlist[node])
        {
            if(!vis[it])
            {
                dfs(it,adjlist,vis);
                
            }
        }
    }
public:
    int findCircleNum(vector<vector<int>>& isConnected) {
        int V=isConnected.size();
    vector<int> adjlist[V];
        for(int i=0;i<V;i++)
        {
            for(int j=0;j<V;j++)
            {
                if(isConnected[i][j]==1 && i!=j)
                {
                    adjlist[i].push_back(j);
                    adjlist[j].push_back(i);
                }
            }
        }
       vector<int>vis(V, 0);
        int cnt=0;
        for(int i=0;i<V;i++)
        {
            if(!vis[i])
            {cnt++;
            dfs(i,adjlist,vis);
            } 
        }
        return cnt;
        
    }
};