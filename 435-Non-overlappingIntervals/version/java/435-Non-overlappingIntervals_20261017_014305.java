// Last updated: 17/10/2026, 01:43:05
1class Solution {
2    public int eraseOverlapIntervals(int[][] intervals) {
3
4        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
5        int remove = 0;
6        int n = intervals.length;
7
8        int curr = intervals[0][1];
9
10        for (int i = 1; i < n; i++) {
11            if (curr > intervals[i][0]) {
12                remove++;
13            } else {
14                curr = intervals[i][1];
15            }
16        }
17        return remove;
18
19    }
20}