// Last updated: 02/11/2026, 01:21:54
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
12    public ListNode deleteDuplicates(ListNode head) {
13        ListNode temp = head;
14        while(temp != null){
15            while(temp.next != null && temp.val == temp.next.val){
16                temp.next = temp.next.next;
17            }
18            temp=temp.next;
19
20        }
21        return head;
22    }
23}