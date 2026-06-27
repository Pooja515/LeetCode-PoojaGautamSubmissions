// Last updated: 28/06/2026, 01:01:52
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head , fast = head , temp= head;
       if (head == null || head.next == null) {
           return null;
     }
        while(fast != null && fast.next !=  null){
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        temp.next = slow.next;
        return head;

    }
}