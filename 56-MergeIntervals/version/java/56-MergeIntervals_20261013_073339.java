// Last updated: 13/10/2026, 07:33:39
1class Solution {
2    public int[][] merge(int[][] intervals) {
3        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
4        List<int[]> res = new ArrayList<>();
5
6        for(int[] interval:intervals){
7            if(res.isEmpty() || interval[0]>res.get(res.size()-1)[1]){
8                res.add(interval);
9            }
10            else{
11                int[] last = res.get(res.size()-1);
12                last[1] = Math.max(last[1],interval[1]);
13            }
14        }
15        return res.toArray(new int[res.size()][]);
16    }
17}