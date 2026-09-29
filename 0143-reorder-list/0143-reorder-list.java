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
    public void reorderList(ListNode head) {
        ListNode temp = head;
        ListNode slow = temp;
        ListNode fast = temp;
        while(fast!=null && fast.next != null ){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode prev = null;
        ListNode curr = slow.next;
        slow.next = null;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next ;
        }
        ListNode odd = temp;
        ListNode even = prev;


        while(even!=null ){
            ListNode oddd = odd.next;
            ListNode evenn = even.next;

            odd.next = even;
            even.next = oddd;
            odd = oddd;
            even = evenn;


            

        }




        
    }
}