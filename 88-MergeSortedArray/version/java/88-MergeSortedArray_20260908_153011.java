// Last updated: 08/09/2026, 15:30:11
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        int i=m-1 ,j=n-1,k=m+n-1;
4        
5        while(i>=0 && j>=0){
6            if(nums1[i]>=nums2[j]){
7                nums1[k--] = nums1[i];
8                i--;
9            }
10            else{
11                nums1[k--] = nums2[j];
12                j--;
13            }
14        }
15        while(j>=0){
16            nums1[k--] = nums2[j];
17            j--;
18        }
19    }
20}