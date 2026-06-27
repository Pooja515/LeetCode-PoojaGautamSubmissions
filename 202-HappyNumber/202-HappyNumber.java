// Last updated: 28/06/2026, 01:03:45
class Solution {
    public boolean isHappy(int n) {
        int slow=n,fast=n;
        while(true){
            slow=getnxt(slow);
            fast=getnxt(getnxt(fast));
            if(slow==fast) break;
        }
        return slow==1;
    }
    int getnxt(int n){
        int sum=0;
        while(n>0){
        int digit=n%10;
        sum+=digit*digit;
        n/=10;
        }
        return sum;
    }
}