// Last updated: 06/10/2026, 22:26:16
1class Solution {
2    public int[] findOrder(int numCourses, int[][] prerequisites) {
3        List<List<Integer>> adj= new ArrayList<>();
4
5        for(int i=0;i<numCourses;i++){
6            adj.add(new ArrayList<>());
7        }
8
9        int[] indegree = new int[numCourses];
10        
11        for(int[] edge: prerequisites){
12            adj.get(edge[1]).add(edge[0]);
13            indegree[edge[0]]++;
14
15        }
16        Queue<Integer> q= new LinkedList<>();
17
18        for(int i=0;i<numCourses;i++){
19            if(indegree[i] == 0){
20                q.offer(i);
21            }
22        }
23        int ind=0;
24        int[] ans = new int[numCourses];
25        while(!q.isEmpty()){
26            int node = q.poll();
27            ans[ind++]=node;
28            for(int neigh: adj.get(node)){
29                indegree[neigh]--;
30                if(indegree[neigh] == 0){
31                    q.offer(neigh);
32                }
33            }
34            if(ind==numCourses) return ans;
35
36
37        }
38        return new int[] {};
39
40    }
41}
42