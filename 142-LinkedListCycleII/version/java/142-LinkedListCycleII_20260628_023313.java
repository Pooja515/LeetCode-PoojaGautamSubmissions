// Last updated: 28/06/2026, 02:33:13
// Approach:I used the Tortoise and Hare algorithm (slow and fast pointers) to detect the cycle in the Linked List.Cycle Detection: The fast pointer moves two steps at a time while the slow pointer moves one step. If they meet (slow == fast), a cycle exists.Finding the Start of the Cycle: Once the cycle is detected, I reset the slow pointer back to the head of the Linked List while keeping the fast pointer at the meeting point. Then, I move both pointers forward at the same speed (one step at a time). The point where they meet again is the start of the cycle.Time Complexity: O(N)— In the worst case, we traverse the list nodes a constant number of times.Space Complexity: O(1) — Only two pointers are used, requiring no extra memory.
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
13    public ListNode detectCycle(ListNode head) {
14        ListNode slow = head , fast = head;
15        while(fast != null && fast.next != null){
16            slow = slow.next;
17            fast = fast.next.next;
18            if(slow == fast){
19               slow = head;
20                while(slow != fast){
21                    slow = slow.next;
22                    fast = fast.next;
23                }
24                return slow;
25            }
26        }
27        return null;
28    }
29}