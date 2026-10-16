// Last updated: 16/10/2026, 09:07:32
1class Solution {
2    public int[][] merge(int[][] intervals) {
3        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
4
5        List<int[]> ans = new ArrayList<>();
6
7        for(int[] interval:intervals){
8            if(ans.isEmpty() || ans.get(ans.size()-1)[1] < interval[0]){
9                ans.add(interval);
10            }
11            else{
12                int[] last = ans.get(ans.size()-1);
13                last[1] = Math.max(last[1],interval[1]);
14            }
15        }
16        return ans.toArray(new int[ans.size()][]);
17    }
18}