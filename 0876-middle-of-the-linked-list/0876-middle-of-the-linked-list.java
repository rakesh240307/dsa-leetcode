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
    public ListNode middleNode(ListNode head) {
        ListNode a = head;
        ListNode b = head;
        while( a.next != null && a.next.next!=null){
            a = a.next.next;
            b = b.next;
        }
        if(a.next!=null){
            return b.next;
        }
        return b;
        
    }
}