// Last updated: 18/10/2026, 01:15:03
1class Solution {
2    public int eraseOverlapIntervals(int[][] intervals) {
3        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
4
5        int remove=0;
6        int currelementlast=intervals[0][1];
7
8        for(int i=1;i<intervals.length;i++){
9            if(currelementlast>intervals[i][0]) remove++;
10            else{
11                currelementlast = intervals[i][1];
12            }
13        }
14        return remove;
15    }
16}
17