// Last updated: 04/11/2026, 17:49:52
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public boolean hasCycle(ListNode head) {
14        ListNode slow =head , fast =head;
15        while(fast != null && fast.next != null){
16            slow = slow.next;
17            fast = fast.next.next;
18
19            if(slow == fast) return true;
20        }
21        return false;
22    }
23}