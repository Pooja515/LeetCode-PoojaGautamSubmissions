// Last updated: 17/07/2026, 19:04:00
1class Solution {
2
3    public int minimumEffortPath(int[][] heights) {
4
5        int rows = heights.length;
6        int cols = heights[0].length;
7        // 1. Store minimum effort required to reach each cell
8        int[][] minEffort =  new int[rows][cols];
9
10        for (int[] row : minEffort) {
11            Arrays.fill(row,Integer.MAX_VALUE );
12        }
13        // 2. PriorityQueue
14        // {row, col, effort}
15     
16        PriorityQueue<int[]> pq =new PriorityQueue<>((a, b) ->Integer.compare(a[2],b[2]));
17        // 3. Start from (0, 0)
18        minEffort[0][0] = 0;
19
20        pq.offer(new int[]{ 0,0,0});
21        // Directions:
22        // up, down, left, right
23
24        int[][] directions = {{-1, 0},{1, 0},{0, -1}, {0, 1} };
25
26        // 4. Dijkstra
27       
28        while (!pq.isEmpty()) {
29
30            int[] current = pq.poll();
31
32            int row = current[0];
33
34            int col =current[1];
35
36            int currentEffort = current[2];
37
38            // We reached destination with minimum effort
39            if (row == rows - 1 && col == cols - 1) {
40                return currentEffort;
41            } 
42            // 5. Explore four neighbors
43           
44            for (int[] direction :directions) {
45
46                int nextRow =row + direction[0];
47                int nextCol =col + direction[1];
48                // Check boundarie
49                if (nextRow < 0 || nextRow >= rows || nextCol < 0 || nextCol >= cols) {
50                    continue;
51                }
52                // Calculate effort of this single move
53
54                int edgeEffort =Math.abs(heights[row][col] - heights[nextRow][nextCol]);
55                // Path effort is the maximum effort
56                // encountered on the entire path
57
58                int newEffort = Math.max(currentEffort,edgeEffort );
59                // Relaxation
60                if (newEffort < minEffort[nextRow][nextCol]) {
61                         minEffort[nextRow][nextCol] =newEffort;
62
63
64                    pq.offer(new int[]{ nextRow,nextCol,newEffort } );
65                }
66            }
67        }
68
69
70        return 0;
71    }
72}