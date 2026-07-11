// Last updated: 11/07/2026, 17:40:22
1class Solution {
2    public int[][] highestPeak(int[][] isWater) {
3        if (isWater == null || isWater.length == 0)
4            return isWater;
5        Queue<int[]> q = new LinkedList<>();
6        int rows = isWater.length, cols = isWater[0].length;
7        int distance = 0;
8        for (int i = 0; i < rows; i++) {
9            for (int j = 0; j < cols; j++) {
10                if (isWater[i][j] == 1) {
11                    q.offer(new int[] { i, j });
12                    isWater[i][j] = 0; // Important
13                } else {
14                    isWater[i][j] = -1;
15                }
16            }
17        }
18        int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
19        while (!q.isEmpty()) {
20            int[] cell = q.poll();
21            int r = cell[0];
22            int c = cell[1];
23            for (int[] d : directions) {
24                int newr = r + d[0];
25                int newc = c + d[1];
26                if (newr >= 0 && newr < rows && newc >= 0 && newc < cols && isWater[newr][newc] == -1) {
27                    isWater[newr][newc] = isWater[r][c] + 1;
28                    q.offer(new int[] { newr, newc });
29                }
30            }
31        }
32
33        return isWater;
34    }
35}
36