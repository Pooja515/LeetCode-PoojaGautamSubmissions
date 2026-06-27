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
         ListNode slow = head , fast = head;
         while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
         }
         ListNode  newhead = slow.next;
         ListNode prev = null;
         ListNode  curr = newhead;
         while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
         }
         ListNode temp = head, rhead = prev;
         while(rhead != null){
            if(temp.val != rhead.val) return false;
            temp =  temp.next;
            rhead = rhead.next;
         }
         return true;
    }
}