// Last updated: 10/08/2026, 03:53:57
1class Solution {
2    int[] memo;
3    public int maxSumAfterPartitioning(int[] arr, int k) {
4        int n = arr.length;
5        memo=new int[n];
6        Arrays.fill(memo,-1);
7
8        return f(0,k,arr,n);
9    }
10    int f(int ind , int k ,int[] arr , int n){
11        if(ind == n) return 0;
12        int len =0,maxi=Integer.MIN_VALUE , totalsum =Integer.MIN_VALUE;
13        if(memo[ind] != -1) return memo[ind];
14        for(int j=ind;j<Math.min(ind+k,n);j++){
15            len++;
16            maxi=Math.max(maxi,arr[j]);
17            int sum = len * maxi + f(j+1,k,arr,n);
18            totalsum = Math.max(totalsum,sum);
19        }
20        return memo[ind]= totalsum;
21    }
22}