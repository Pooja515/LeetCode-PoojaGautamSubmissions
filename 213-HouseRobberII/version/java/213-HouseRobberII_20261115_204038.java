// Last updated: 15/11/2026, 20:40:38
1class Solution {
2    int[] memo1;
3    int[] memo2;
4    public int rob(int[] nums) {
5        int n = nums.length;
6        if(n==1) return nums[0];
7
8        int[] excludelast = new int[n-1];
9       
10        int[] excludefirst = new int[n-1];
11
12        for(int i=0;i<n-1;i++){
13            excludelast[i] = nums[i];
14        }
15
16        for(int i=1;i<n;i++){
17            excludefirst[i-1] = nums[i];
18        }
19
20        int m =  excludelast.length;
21        memo1 = new int[m];
22        memo2 = new int[m];
23
24        Arrays.fill(memo1,-1);
25        Arrays.fill(memo2,-1);
26
27        int last = f(m-1,excludelast,memo1);
28        int first = f(m-1,excludefirst,memo2);
29
30        return Math.max(last,first);
31    }
32
33    int f(int i ,int[] nums,int[] memo){
34      
35        if(i==0) return nums[0];
36        if(i==1) return Math.max(nums[0],nums[1]);
37
38        if(memo[i] != -1) return memo[i];
39
40        int choice1 = nums[i] + f(i-2,nums,memo);
41        int choice2 = f(i-1,nums,memo);
42       
43       return memo[i] = Math.max(choice1,choice2);
44    }
45}