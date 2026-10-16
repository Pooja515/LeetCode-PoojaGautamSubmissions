// Last updated: 16/10/2026, 11:29:13
1class Solution {
2    public int[][] insert(int[][] intervals, int[] newInterval) {
3        int n= intervals.length;
4        List<int[]> ans= new ArrayList<>();
5        int i=0;
6        while(i<n && intervals[i][1] < newInterval[0]){
7            ans.add(intervals[i]);
8            i++;
9        }
10        while(i<n && intervals[i][0] <= newInterval[1]){
11            newInterval[0] = Math.min(intervals[i][0] , newInterval[0]);
12            newInterval[1] = Math.max(intervals[i][1] , newInterval[1]);
13            i++;
14        }
15        ans.add(newInterval);
16
17        while(i<n){
18            ans.add(intervals[i]);
19            i++;
20        }
21
22        return ans.toArray(new int[ans.size()][]);
23    }
24}