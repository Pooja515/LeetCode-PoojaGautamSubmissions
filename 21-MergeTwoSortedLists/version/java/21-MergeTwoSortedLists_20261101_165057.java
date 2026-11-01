// Last updated: 01/11/2026, 16:50:57
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
12    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
13        ListNode dummy = new ListNode(0);
14        ListNode t1 = list1 , t2 = list2 , temp = dummy;
15
16        while(t1 != null && t2 != null){
17        if(t1.val <= t2.val){
18            temp.next = t1;
19            t1 = t1.next;
20        }
21        else{
22            temp.next = t2;
23            t2 = t2.next;
24        }
25        temp = temp.next;
26        }
27        temp.next = (t1 != null) ? t1:t2;
28         return dummy.next;
29    }
30   
31}