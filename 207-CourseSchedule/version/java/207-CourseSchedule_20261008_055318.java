// Last updated: 08/10/2026, 05:53:18
1class Solution {
2    public boolean canFinish(int numCourses, int[][] prerequisites) {
3        List<List<Integer>> adj = new ArrayList<>();
4
5        for(int i=0;i<numCourses;i++){
6            adj.add(new ArrayList<>());
7        }
8        int[] indegree= new int[numCourses];
9
10        for(int[] edge:prerequisites){
11            adj.get(edge[1]).add(edge[0]);
12            indegree[edge[0]]++;
13        }
14        Queue<Integer> q = new LinkedList<>();
15
16        for(int i=0;i<numCourses;i++){
17            if(indegree[i] ==0){
18                q.offer(i);
19            } 
20        }
21        int ind=0;
22        while(!q.isEmpty()){
23            int cur=q.poll();
24            ind++;
25
26            for(int neigh : adj.get(cur)){
27                indegree[neigh]--;
28                if(indegree[neigh] ==0) {
29                    q.offer(neigh);
30                }
31            }
32            if(ind == numCourses) return true;
33        }
34        return false;
35
36    }
37}