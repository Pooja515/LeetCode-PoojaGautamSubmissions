// Last updated: 14/10/2026, 14:54:00
1class Solution {
2    public int findMinArrowShots(int[][] points) {
3       int n= points.length;
4       if(n==0) return 0;
5
6       Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
7
8       int arrows=1;
9       int lastElementEnd= points[0][1];
10
11       for(int i=1;i<n;i++){
12        if(points[i][0] > lastElementEnd){
13            arrows++;
14            lastElementEnd = points[i][1];
15        }
16       } 
17       return arrows;
18    }
19}