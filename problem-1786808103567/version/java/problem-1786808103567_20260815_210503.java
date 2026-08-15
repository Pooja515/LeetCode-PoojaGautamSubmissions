// Last updated: 15/08/2026, 21:05:03
1class Solution {
2    public int minOperations(String s) {
3        int n= s.length();
4        int res= Integer.MAX_VALUE;
5        for(int i=0;i<n;i++){
6            int cost = i;
7            for(int j=0;j<n/2;j++){
8                int left =(i+j)%n;
9                int right =(i+n-1-j)%n;
10
11                char a=s.charAt(left);
12                char b = s.charAt(right);
13
14                int diff = Math.abs(a-b);
15
16                int incr = Math.min(diff, 26-diff);
17                cost +=incr;
18            }
19            res=Math.min(res,cost);
20        }
21        return res;
22    }
23}