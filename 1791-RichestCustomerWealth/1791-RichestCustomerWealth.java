// Last updated: 28/06/2026, 01:02:02
class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxi=0;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            maxi=Math.max(sum,maxi);

        }
        return maxi;
    }
}