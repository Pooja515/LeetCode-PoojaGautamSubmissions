// Last updated: 29/08/2026, 20:29:41
1class Solution {
2    public int minBishopMoves(int[] source, int[] target) {
3       int sr = source[0];
4       int sc = source[1];
5
6        int tr = target[0];
7        int tc = target[1];
8
9        if(sr == tr && sc == tc) return 0;
10        if((sr+sc)%2 != (tr+tc)%2) return -1;
11
12        if(Math.abs(sr-tr) == Math.abs(sc-tc)) return 1;
13
14        return 2;
15        
16    }
17}