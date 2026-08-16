// Last updated: 16/08/2026, 08:50:15
1class Solution {
2    public int nearestDrone(int[][] drones, int[] target) {
3        int currindex = -1;
4        int maxdistance =Integer.MAX_VALUE;
5
6        for(int i=0;i<drones.length;i++){
7            int x =drones[i][0];
8            int y=drones[i][1];
9            int range = drones[i][2];
10            int distance = Math.abs(x-target[0])+Math.abs(y-target[1]);
11            if(distance <= range){
12                if(distance<maxdistance ){
13                    maxdistance =distance;
14                    currindex=i;
15                }
16            }
17        }
18        return  currindex;
19    }
20}