// Last updated: 28/06/2026, 01:01:51
class Solution {
    public long minimumSteps(String s) {
        long blackcnt=0,swap=0;
        for(char c:s.toCharArray()){
            if(c=='1') blackcnt++;
            else
                   swap+=blackcnt;
        }
        return swap;
    }
}