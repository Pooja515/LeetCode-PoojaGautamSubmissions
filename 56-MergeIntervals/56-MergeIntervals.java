// Last updated: 28/06/2026, 01:05:03
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        List<int[]> res = new ArrayList<>();
        int n = intervals.length;
        res.add(intervals[0]);
        for(int i=0;i<n; i++){
            int[] last = res.get(res.size()-1);
            if(intervals[i][0] <= last[1]){
                last[1] = Math.max(last[1],intervals[i][1]);
            }
            else{
                res.add(intervals[i]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}