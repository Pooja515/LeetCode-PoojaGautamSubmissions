// Last updated: 05/11/2026, 15:49:13
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
12    public ListNode removeElements(ListNode head, int val) {
13       ListNode dummy = new ListNode(0);
14       dummy.next = head;
15       ListNode temp=dummy;
16       
17       while(temp.next != null) {
18        if(temp.next.val == val){
19            temp.next = temp.next.next;
20        }
21        else{
22            temp=temp.next;
23        }
24       
25       }
26       return dummy.next;
27    }
28}