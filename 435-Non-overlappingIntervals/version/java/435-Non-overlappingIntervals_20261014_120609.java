// Last updated: 14/10/2026, 12:06:09
1class Solution {
2    public int eraseOverlapIntervals(int[][] intervals) {
3        // Sort by end time
4        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
5
6        int removals = 0;
7        int lastEnd = intervals[0][1];
8
9        for (int i = 1; i < intervals.length; i++) {
10            // Overlap: remove current interval
11            if (intervals[i][0] < lastEnd) {
12                removals++;
13            } else {
14                // No overlap: keep current interval
15                lastEnd = intervals[i][1];
16            }
17        }
18
19        return removals;
20    }
21}
22