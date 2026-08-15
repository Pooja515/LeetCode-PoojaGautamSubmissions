// Last updated: 15/08/2026, 20:18:30
1class Solution {
2    public int elevatorRequests(int n, int[] requests) {
3        int curr=0;
4        int time=0;
5        
6        for(int i=0;i<requests.length;i++){
7            time += Math.abs(curr - requests[i]);
8            curr = requests[i];
9        }
10        return time;
11    }
12}