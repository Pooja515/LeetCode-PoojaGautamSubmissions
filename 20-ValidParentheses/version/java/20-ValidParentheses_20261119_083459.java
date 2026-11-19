// Last updated: 19/11/2026, 08:34:59
1class Solution {
2    public boolean isValid(String s) {
3        Deque<Character> st = new ArrayDeque<>();
4
5        for(char c : s.toCharArray()){
6            if(c == '(' || c == '{' || c == '['){
7                st.push(c);
8            }
9            else{
10                if(st.isEmpty()) return false;
11                char top = st.pop();
12
13                if(c == ')' && top != '(') return false;
14                if(c == '}' && top != '{') return false;
15                if(c == ']' && top != '[') return false;
16            }
17        }
18        return st.isEmpty();
19    }
20}