// Last updated: 03/11/2026, 04:41:53
1class Solution {
2    public int[][] insert(int[][] intervals, int[] newInterval) {
3        List<int[]> ans = new ArrayList<>();
4        int i=0 , n= intervals.length;
5        while(i<n && intervals[i][1] < newInterval[0]){
6            ans.add(intervals[i]);
7            i++;
8        }
9
10        while(i<n && intervals[i][0] <= newInterval[1]){
11            newInterval[0]= Math.min(newInterval[0],intervals[i][0]);
12            newInterval[1] = Math.max(newInterval[1] , intervals[i][1]);
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
23
24    }
25}