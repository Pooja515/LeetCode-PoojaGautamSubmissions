// Last updated: 26/09/2026, 20:23:28
1class Solution {
2    public int minQueenMoves(int[] source, int[] target) {
3        int sr = source[0], sc = source[1];
4        int tr = target[0], tc = target[1];
5
6        // 0 moves if source and target are the same
7        if (sr == tr && sc == tc) {
8            return 0;
9        }
10
11        // 1 move if on the same row, column, or diagonal
12        if (sr == tr || sc == tc || Math.abs(sr - tr) == Math.abs(sc - tc)) {
13            return 1;
14        }
15
16        // 2 moves for all other positions on an empty board
17        return 2;
18    }
19}