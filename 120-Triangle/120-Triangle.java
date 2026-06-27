// Last updated: 28/06/2026, 01:04:24
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int[] prev=new int[n];
        // Base case 
       for(int j=0;j<n;j++){
            prev[j]=triangle.get(n-1).get(j);
       }
    for(int i=n-2;i>=0;i--){
        int[] curr=new int[n];
        for(int j=0;j<=i;j++){
           int down= prev[j];
           int dg= prev[j+1];
           curr[j]=triangle.get(i).get(j)+Math.min(down,dg);
        }
        prev=curr;
    }
    return prev[0];
    }
}