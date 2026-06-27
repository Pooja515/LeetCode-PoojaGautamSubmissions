// Last updated: 28/06/2026, 01:37:29
/*
 * I will use slow and fast pointer i.e Tortoise and hare method to find the middle of the Linked List. I will take care of two edge cases : 1) when n is even , to get middle ,the fast ==null .
 * 2)when n is odd , to get middle , the fast.next == null.
 * so, check : while(fast != null && fast.next !=null) the loop iterates.
 * => Time Complexity : O(N)
 * => Space Complexity : O(1)
*/

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
14        while(fast != null && fast.next != null) {
15            slow = slow.next;
16            fast = fast.next.next;
17        }
18        return slow;
19    }
20}