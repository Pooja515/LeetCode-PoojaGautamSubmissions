// Last updated: 01/11/2026, 05:14:44
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
14        ListNode temp =dummy;
15        ListNode t1=list1 , t2 = list2;
16
17        while(t1 != null && t2 != null){
18            if(t1.val <= t2.val){
19                temp.next = t1;
20               t1=t1.next;
21            }
22            else{
23                temp.next = t2;
24                t2=t2.next;
25            }
26            temp=temp.next;
27        }
28         temp.next=(t1!=null)?t1:t2;
29        return dummy.next;
30    }
31}