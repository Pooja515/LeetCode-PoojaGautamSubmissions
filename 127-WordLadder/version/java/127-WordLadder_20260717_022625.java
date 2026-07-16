// Last updated: 17/07/2026, 02:26:25
1class Pair {
2    String word;
3    int steps;
4    
5    Pair(String word, int steps) {
6        this.word = word;
7        this.steps = steps;
8    }
9}
10class Solution {
11    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
12        
13        // Creating a queue for BFS storing object of Pair (word, steps)
14        Queue<Pair> q = new LinkedList<>();
15        q.add(new Pair(beginWord, 1));
16
17        // Push all values of wordList into a set for efficient O(1) lookups and deletions
18        Set<String> st = new HashSet<>();
19        for (String word : wordList) {
20            st.add(word);
21        }
22        
23        // Remove the starting word from the set if it exists to prevent visiting it again
24        st.remove(beginWord);
25
26        while (!q.isEmpty()) {
27            String word = q.peek().word;
28            int steps = q.peek().steps;
29            q.remove();
30
31            // If the target word is reached, return the number of steps taken
32            if (word.equals(endWord)) {
33                return steps;
34            }
35
36            // Try replacing every character of the current word from 'a' to 'z'
37            for (int i = 0; i < word.length(); i++) {
38                for (char ch = 'a'; ch <= 'z'; ch++) {
39                    char replacedCharArray[] = word.toCharArray();
40                    replacedCharArray[i] = ch;
41                    String replacedWord = new String(replacedCharArray);
42
43                    // If the newly formed word exists in the set, push it to the queue
44                    if (st.contains(replacedWord)) {
45                        st.remove(replacedWord); // Act as marking it visited
46                        q.add(new Pair(replacedWord, steps + 1));
47                    }
48                }
49            }
50        }
51        
52        // Return 0 if no transformation sequence is possible
53        return 0;
54    }
55}