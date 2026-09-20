// Last updated: 20/09/2026, 08:14:44
1class Solution {
2    public int countIntersectingIntervals(int[][] intervals) {
3        int cnt=0;
4        int n = intervals.length;
5        for(int i=0;i<n;i++){
6            for(int j=i+1;j<n;j++){
7                int firststart = intervals[i][0];
8                int firstend = intervals[i][1];
9                int secstart=intervals[j][0];
10                int secend = intervals[j][1];
11
12                if(Math.max(firststart,secstart) <= Math.min(firstend,secend)){
13                    cnt++;
14                }
15            }
16        }
17        return cnt;
18    }
19}