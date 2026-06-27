// Last updated: 28/06/2026, 01:04:23
class Solution {
    public int maxProfit(int[] prices) {
        int buy = (int) 1e9;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0 ;i< prices.length ; i++){
            buy = Math.min(buy , prices[i]);
            maxi = Math.max(maxi , (prices[i] - buy));
        }
        return maxi;
    }
}