// Last updated: 17/08/2026, 08:40:30
1class Solution {
2    public boolean canFinish(int numCourses, int[][] prerequisites) {
3        List<List<Integer>> adj = new ArrayList<>();
4        for(int i=0; i<numCourses; i++){
5            adj.add(new ArrayList<>());
6        }
7        int[] indegree = new int[numCourses];
8
9        for(int[] edge : prerequisites){
10            adj.get(edge[1]).add(edge[0]);
11            indegree[edge[0]]++;
12        }
13
14        Queue<Integer> q = new LinkedList<>();
15        for(int i=0;i<numCourses;i++){
16            if(indegree[i] == 0){
17                q.add(i);
18            }
19        }
20        
21        int ind =0;
22        while(!q.isEmpty()){
23            int node = q.poll();
24            ind++;
25            for(int neg:adj.get(node)){
26                indegree[neg]--;
27                if(indegree[neg] == 0){
28                    q.add(neg);
29                }
30            }
31        }
32
33        if(ind == numCourses) return true;
34
35        return false;
36
37    }
38}