// Last updated: 11/10/2026, 08:19:22
1class Solution {
2    public boolean threeFibonacciSum(int n) {
3
4        long num1=0,num2=1;
5
6        while(true){
7            long num3 = num1+num2;
8            long sum = num1+num2+num3;
9
10            if(sum==n) return true;
11            if(sum>n || num3>n) break;
12
13            num1=num2;
14            num2=num3;
15        }
16
17        if(n==2) return true;
18
19        return false;
20        
21    }
22}