// Last updated: 15/10/2026, 00:30:30
1class Solution {
2   
3    public int climbStairs(int n) {
4
5        // BASE CASE TO STEP O STAIRS THERE IS 1 WAY AND 1 STEP THERE IS 1 WAY 
6
7        if(n<=1) return 1;
8        int[] memo= new int[n];
9        Arrays.fill(memo,-1);
10
11        // RETURN COUNT OF ALL DISTINCT WAYS TO REACH N STAIRS 
12        
13        return  climb(n-1,memo) +  climb(n-2,memo);
14    }
15
16    int climb(int i,int[] memo){
17        if(i<=1) return 1;
18
19        if(memo[i] != -1) return memo[i];
20
21        return memo[i] = climb(i-1,memo) +climb(i-2,memo);
22    }
23}
24
25/*
26T.C : O(2^N)  // TWO CHOICES WE HAVE 1 STEP OR TWO STEPS FUNCTION CALL                       
27S.C : O(N) // RECURSIVE CALL STACK DEPTH     
28
29**/