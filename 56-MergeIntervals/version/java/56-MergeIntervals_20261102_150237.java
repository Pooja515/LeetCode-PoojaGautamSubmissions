// Last updated: 02/11/2026, 15:02:37
1class Solution {
2    public int[][] merge(int[][] intervals) {
3        List<int[]> ans = new ArrayList<>();
4
5        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
6
7        for(int[] interval:intervals){
8            if(ans.isEmpty() || interval[0] > ans.get(ans.size()-1)[1]){
9                ans.add(interval);
10            }
11            else{
12                int[] last = ans.get(ans.size()-1);
13                last[1] = Math.max(last[1],interval[1]);
14            }
15
16        }
17        return ans.toArray(new int[ans.size()][]) ;
18    }
19}