// Last updated: 05/11/2026, 15:17:51
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
12    public ListNode middleNode(ListNode head) {
13        ListNode slow = head , fast = head;
14
15        while(fast != null && fast.next != null){
16            slow = slow.next;
17            fast = fast.next.next;
18
19            if(slow == fast) return slow;
20        }
21        return slow;
22    }
23}