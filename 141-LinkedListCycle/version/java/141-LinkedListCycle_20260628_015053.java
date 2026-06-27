// Last updated: 28/06/2026, 01:50:53
/*
 * Approach : Used Tortoise and hare method i.e slow and fast pointer , to detect cycle the moment slow == fast , means it has cycle and return true .If linear Linked List then return false .
 * => Time Complexity : O(N)
 * => Space Complexity : O(1)
*/

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
12
13class Solution {
14    public boolean hasCycle(ListNode head) {
15        ListNode slow = head , fast = head;
16        while(fast != null && fast.next != null){
17             slow = slow.next;
18             fast = fast.next.next;
19             if(slow == fast) return true;
20        }
21        return false;
22    }
23}
24