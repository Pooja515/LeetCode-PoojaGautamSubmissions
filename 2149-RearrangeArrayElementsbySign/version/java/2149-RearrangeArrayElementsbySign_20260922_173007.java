// Last updated: 22/09/2026, 17:30:07
1class Solution {
2    public int[] rearrangeArray(int[] nums) {
3        int n = nums.length;
4        int[] a1=new int[n/2];
5        int[] a2=new int[n/2];
6
7        int j=0,k=0;
8        for(int i=0;i<n;i++){
9            if(nums[i] >=0){
10                a1[j++] = nums[i];
11            }
12            else{
13                a2[k++] = nums[i];
14            }
15        }
16        int[] res=new int[n];
17        int l=0 ,r=0 , m=0;
18        while(l<n/2 && r<n/2){
19            res[m++] = a1[l++];
20            res[m++] = a2[r++];
21        }
22        return res;
23    }
24}