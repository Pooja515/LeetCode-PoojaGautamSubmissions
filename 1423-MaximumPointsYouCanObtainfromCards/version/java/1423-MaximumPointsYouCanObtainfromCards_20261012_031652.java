// Last updated: 12/10/2026, 03:16:52
1class Solution {
2    public int maxScore(int[] cardPoints, int k) {
3        int lsum=0,rsum=0,maxsum=0;
4        int n= cardPoints.length;
5        for(int i=0;i<k;i++){
6            lsum += cardPoints[i];
7            maxsum = lsum;
8        }
9        int r=n-1;
10        for(int i=k-1;i>=0;i--){
11            lsum -= cardPoints[i];
12            rsum +=cardPoints[r--];
13            maxsum=Math.max(maxsum,(lsum+rsum));
14        }
15        return maxsum;
16    }
17}