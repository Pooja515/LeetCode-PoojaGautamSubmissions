// Last updated: 28/06/2026, 04:11:19
/*
 * Approach : 
 * Find the Middle: The Hare and Tortoise (slow/fast pointer) approach effectively halts the slow pointer at the middle of the linked list.
 * Reverse the Second Half: Reversing the list starting from slow.next using the iterative three-pointer technique (prev, curr, next) allows you to do an in-place modification.
 * Palindrome Check: By keeping temp at the original head and rhead at the head of the reversed second half, you compare the values element by element until rhead runs out.
 * 
 * Time Complexity: O(N) //Finding the mid-point:  O(N/2) //Reversing the second half: O(N/2} steps.
 * //Comparison phase: O(N/2)steps.
 * Space Complexity: O(1)
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
12    public boolean isPalindrome(ListNode head) {
13         ListNode slow = head , fast = head;
14         while(fast.next != null && fast.next.next != null){
15            slow = slow.next;
16            fast = fast.next.next;
17         }
18         ListNode  newhead = slow.next;
19         ListNode prev = null;
20         ListNode  curr = newhead;
21         while(curr != null){
22            ListNode next = curr.next;
23            curr.next = prev;
24            prev = curr;
25            curr = next;
26         }
27         ListNode temp = head, rhead = prev;
28         while(rhead != null){
29            if(temp.val != rhead.val) return false;
30            temp =  temp.next;
31            rhead = rhead.next;
32         }
33         return true;
34    }
35}