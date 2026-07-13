// Last updated: 13/07/2026, 16:06:20
1class Solution {
2    public boolean canFinish(int numCourses, int[][] prerequisites) {
3        List<List<Integer>> adj=new ArrayList<>();
4        for(int i=0;i<numCourses;i++){
5            adj.add(new ArrayList<>());
6        }
7
8        int[] indegree = new int[numCourses];
9
10        for(int[] edge:prerequisites ){
11            adj.get(edge[1]).add(edge[0]); 
12            indegree[edge[0]]++;
13        }
14        Queue<Integer> q= new LinkedList<>();
15        for(int i=0;i<numCourses;i++){
16            if(indegree[i]==0) q.offer(i);
17        }
18        int index=0;
19        while(!q.isEmpty()){
20            int node=q.poll();
21            index++;
22            for(int neighbour:adj.get(node)){
23                indegree[neighbour]--;
24                if(indegree[neighbour]==0) q.offer(neighbour);
25            }
26        }
27        return index==numCourses;
28    }
29}