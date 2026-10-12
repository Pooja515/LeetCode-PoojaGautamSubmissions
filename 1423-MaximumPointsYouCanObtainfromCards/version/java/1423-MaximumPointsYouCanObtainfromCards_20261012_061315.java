// Last updated: 12/10/2026, 06:13:15
1class Solution {
2    public int maxScore(int[] cardPoints, int k) {
3        int lsum = 0, rsum = 0, maxi = 0, n = cardPoints.length;
4
5        for (int i = 0; i < k; i++) {
6            lsum += cardPoints[i];
7            maxi = lsum;
8        }
9        int r = n - 1;
10        for (int i = k - 1; i >= 0; i--) {
11            lsum -= cardPoints[i];
12            rsum += cardPoints[r--];
13            maxi = Math.max(maxi, (lsum + rsum));
14        }
15        return maxi;
16
17    }
18}