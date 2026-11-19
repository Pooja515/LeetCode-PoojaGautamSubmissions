// Last updated: 19/11/2026, 14:28:17
1class MinStack {
2    Deque<Integer> stack;
3    Deque<Integer> minStack;
4
5    public MinStack() {
6        stack = new ArrayDeque<>();
7        minStack = new ArrayDeque<>();
8    }
9    
10    public void push(int value) {
11        stack.push(value);
12        if(minStack.isEmpty() || value <= minStack.peek()){
13            minStack.push(value);
14        }
15    }
16    
17    public void pop() {
18        int removed = stack.pop();
19        if(removed == minStack.peek()){
20            minStack.pop();
21        }
22    }
23    
24    public int top() {
25       return stack.peek();
26    }
27    
28    public int getMin() {
29        return minStack.peek();
30    }
31}
32
33/**
34 * Your MinStack object will be instantiated and called as such:
35 * MinStack obj = new MinStack();
36 * obj.push(value);
37 * obj.pop();
38 * int param_3 = obj.top();
39 * int param_4 = obj.getMin();
40 */