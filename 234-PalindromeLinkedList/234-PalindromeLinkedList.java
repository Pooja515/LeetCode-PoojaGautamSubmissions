// Last updated: 28/06/2026, 01:03:33
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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head , fast = head ;
        while(fast.next != null && fast.next.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newhead = slow.next;
        ListNode prev = null , curr = newhead;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        newhead = prev;
        ListNode l= head , r = newhead;
        while(r != null){
            if(l.val != r.val) return false;
            l=l.next;
            r=r.next;
        }
        return true;
    }
}