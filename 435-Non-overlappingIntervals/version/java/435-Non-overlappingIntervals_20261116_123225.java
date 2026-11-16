// Last updated: 16/11/2026, 12:32:25
1class Solution {
2    public int eraseOverlapIntervals(int[][] intervals) {
3        Arrays.sort(intervals,(a,b) ->Integer.compare(a[1],b[1]));
4        int remove=0;
5        int currlast = intervals[0][1];
6
7        for(int i=1;i<intervals.length;i++){
8            if(currlast > intervals[i][0]) remove++;
9            else{
10                currlast = intervals[i][1];
11            }
12        }
13return remove;
14    }
15}