// Last updated: 30/09/2026, 00:09:24
1class Solution {
2    public List<Integer> majorityElement(int[] nums) {
3        int ele1=0,ele2=0;
4        int cnt1=0,cnt2=0;
5        int n=nums.length;
6
7        for(int i=0;i<n;i++){
8            if(cnt1==0 && nums[i] != ele2){
9                ele1=nums[i];
10                cnt1++;
11            }
12            else if(cnt2==0 && nums[i] != ele1){
13                ele2 =nums[i];
14                cnt2++;
15            }
16
17            else if(nums[i] == ele1){
18                cnt1++;
19            }
20              else if(nums[i] == ele2){
21                cnt2++;
22            }
23            else{
24                cnt1--;
25                cnt2--;
26            }
27        }
28    
29        int c1=0,c2=0 ;
30       for(int num : nums){
31                if(num == ele1) c1++;
32                else if(num == ele2) c2++;
33       }
34       List<Integer> ans = new ArrayList<>();
35                if(c1>n/3 ) ans.add(ele1);
36                if(c2>n/3) ans.add(ele2);
37            
38
39            return ans;
40        
41    }
42}