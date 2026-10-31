// Last updated: 31/10/2026, 12:10:24
1class Solution {
2    public boolean isPalindrome(String s) {
3        int l = 0, r = s.length() - 1;
4
5        while (l < r) {
6            while (l < r && !Character.isLetterOrDigit(s.charAt(l)))
7                l++;
8            while (l < r && !Character.isLetterOrDigit(s.charAt(r)))
9                r--;
10
11            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
12                return false;
13
14            l++;
15            r--;
16        }
17
18        return true;
19    }
20}