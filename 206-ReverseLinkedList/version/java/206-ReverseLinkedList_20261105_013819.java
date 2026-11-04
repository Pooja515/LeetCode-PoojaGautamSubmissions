// Last updated: 05/11/2026, 01:38:19
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
12    public ListNode reverseList(ListNode head) {
13        ListNode prev = null , cur = head;
14
15        while(cur != null){
16            ListNode next = cur.next;
17            cur.next =prev;
18            prev = cur;
19            cur = next;
20           
21        }
22        return prev;
23
24    }
25}