// Last updated: 28/06/2026, 01:03:40
class Solution {

    public int rob(int[] nums) {

        int n = nums.length;

        if(n == 1)
            return nums[0];

        int[] excludeLast = new int[n - 1];
        int[] excludeFirst = new int[n - 1];

        for(int i = 0; i < n - 1; i++){
            excludeLast[i] = nums[i];
        }

        for(int i = 1; i < n; i++){
            excludeFirst[i - 1] = nums[i];
        }

        return Math.max(
                solve(excludeLast),
                solve(excludeFirst)
        );
    }

    int solve(int[] arr){

        int n = arr.length;

        if(n == 1)
            return arr[0];

       int prev2 = arr[0] , prev1 = Math.max(arr[0], arr[1]);

        for(int i = 2; i < n; i++){

            int pick = arr[i] + prev2;

            int notPick = prev1;

            int cur = Math.max(pick, notPick);
            prev2 = prev1;
            prev1 = cur;
        }

        return prev1;
    }
}