// Last updated: 28/06/2026, 04:13:12
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public boolean isPalindrome(ListNode head) {
13         ListNode slow = head , fast = head;
14         while(fast.next != null && fast.next.next != null){
15            slow = slow.next;
16            fast = fast.next.next;
17         }
18         ListNode  curr = slow.next;
19         ListNode prev = null;
20         
21         while(curr != null){
22            ListNode next = curr.next;
23            curr.next = prev;
24            prev = curr;
25            curr = next;
26         }
27         ListNode temp = head, newhead = prev;
28         while(newhead != null){
29            if(temp.val != newhead.val) return false;
30            temp =  temp.next;
31            newhead = newhead.next;
32         }
33         return true;
34    }
35}