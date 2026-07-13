// Last updated: 13/07/2026, 16:37:04
1class Solution {
2    public int[] findOrder(int numCourses, int[][] prerequisites) {
3        List<List<Integer>> adj =new ArrayList<>();
4        for(int i=0;i<numCourses;i++){
5            adj.add(new ArrayList<>());
6        }
7        int[] indegree=new int[numCourses];
8
9        for(int[] edge:prerequisites){
10            adj.get(edge[1]).add(edge[0]);
11            indegree[edge[0]]++;
12        }
13
14        Queue<Integer> q=new LinkedList<>();
15        for(int i=0;i<numCourses;i++){
16            if(indegree[i]==0) q.add(i);
17        }
18        int index=0;
19        int[] topo=new int[numCourses];
20        while(!q.isEmpty()){
21            int node=q.poll();
22            topo[index++]=node;
23            for(int neighbour:adj.get(node)){
24                indegree[neighbour]--;
25                if(indegree[neighbour]==0){
26                    q.add(neighbour);
27                }
28            }
29        }
30        if(index!=numCourses) return new int[]{};
31        return topo;
32    }
33}