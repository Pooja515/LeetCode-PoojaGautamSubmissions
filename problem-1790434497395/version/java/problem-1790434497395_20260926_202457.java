// Last updated: 26/09/2026, 20:24:57
1class Solution {
2    public boolean canTransform(int[] source, int[] target) {
3        long sumSource = 0;
4        long sumTarget = 0;
5
6        for (int i = 0; i < source.length; i++) {
7            sumSource += source[i];
8            sumTarget += target[i];
9        }
10
11        return sumSource == sumTarget;
12    }
13}