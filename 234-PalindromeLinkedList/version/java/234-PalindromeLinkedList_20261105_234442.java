// Last updated: 05/11/2026, 23:44:42
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
13        ListNode slow =head , fast = head;
14
15        while(fast.next != null && fast.next.next != null){
16            slow = slow.next;
17            fast = fast.next.next;
18        }
19        ListNode cur = slow.next;
20        ListNode prev = null;
21
22        while(cur != null){
23            ListNode next =cur.next;
24            cur.next =prev;
25            prev = cur;
26            cur=next;
27        }
28        ListNode temp =head, newhead = prev;
29        while(newhead != null){
30            if(temp.val != newhead.val) return false;
31            newhead = newhead.next;
32            temp=temp.next;
33        }
34
35        return true;
36    }
37}