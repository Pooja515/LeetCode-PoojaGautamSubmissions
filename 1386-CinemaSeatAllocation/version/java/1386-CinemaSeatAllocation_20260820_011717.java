// Last updated: 20/08/2026, 01:17:17
1class Solution {
2    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
3
4        Map<Integer, Set<Integer>> rows = new HashMap<>();
5
6        // Store reserved seats row by row
7        for (int[] seat : reservedSeats) {
8            int row = seat[0];
9            int col = seat[1];
10
11            rows.computeIfAbsent(row, x -> new HashSet<>()).add(col);
12        }
13
14        // Initially every row can fit 2 families
15        int answer = 2 * n;
16
17        // Only inspect rows having reservations
18        for (int row : rows.keySet()) {
19
20            Set<Integer> reserved = rows.get(row);
21
22            boolean left = true;
23            boolean middle = true;
24            boolean right = true;
25
26            // Left = 2,3,4,5
27            for (int seat = 2; seat <= 5; seat++) {
28                if (reserved.contains(seat)) {
29                    left = false;
30                    break;
31                }
32            }
33
34            // Middle = 4,5,6,7
35            for (int seat = 4; seat <= 7; seat++) {
36                if (reserved.contains(seat)) {
37                    middle = false;
38                    break;
39                }
40            }
41
42            // Right = 6,7,8,9
43            for (int seat = 6; seat <= 9; seat++) {
44                if (reserved.contains(seat)) {
45                    right = false;
46                    break;
47                }
48            }
49
50            // This row was previously counted as 2.
51            // Remove those 2 and add the actual number.
52            answer -= 2;
53
54            if (left && right) {
55                answer += 2;
56            } else if (left || middle || right) {
57                answer += 1;
58            }
59        }
60
61        return answer;
62    }
63}