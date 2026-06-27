// Last updated: 28/06/2026, 01:02:39
class Solution {
    public int deleteAndEarn(int[] nums) {
        int maxVal = 0;
        for (int num : nums) {
            maxVal = Math.max(maxVal, num);
        }
        int[] points = new int[maxVal + 1];
        for (int num : nums) {
            points[num] += num; 
        }
        int[] memo=new int[points.length];
        Arrays.fill(memo,-1);
        return solve(maxVal, points,memo);
    }
    
    private int solve(int i, int[] points,int[] memo) {
        // Base cases
        if (i == 0) return 0;
        if (i == 1) return points[1];
        if(memo[i]!=-1) return memo[i];
        // Choice 1: Skip the current value
        int choice1 = solve(i - 1, points,memo);
        
        // Choice 2: Take the current value (and skip the adjacent smaller value)
        int choice2 = solve(i - 2, points,memo) + points[i];
        
        // Return the maximum of the two choices
        return memo[i]=Math.max(choice1, choice2);
    
    }
}