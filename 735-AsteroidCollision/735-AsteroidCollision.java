// Last updated: 28/06/2026, 01:02:43
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack=new ArrayDeque<>();
        int n=asteroids.length;
        for(int astero:asteroids){
            boolean destroy=false;
            while(!stack.isEmpty() && astero<0 && stack.peek()>0){
                if(Math.abs(astero)==stack.peek()) {
                    destroy=true;
                    stack.pop();
                    break;
                }
                else if(Math.abs(astero)>stack.peek()) stack.pop();
                else{
                    destroy=true;
                    break;
                }
            }
            if(!destroy)
                   stack.push(astero);
        }
        int[] ans=new int[stack.size()];
        for(int i=stack.size()-1;i>=0;i--)
        {
            ans[i]=stack.pop();
        }
        return ans;
    }
}