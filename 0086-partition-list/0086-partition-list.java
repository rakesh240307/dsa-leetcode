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
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null){
            return head; 
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode dummy2 = new ListNode(0);
        dummy2.next = head;
        ListNode temp = dummy ;
        ListNode temp2 = dummy2;
        ListNode curr = head;
        while(curr!=null){
            if(curr.val<x){
                temp.next=curr;
                temp = temp.next;
            }
            else{
                temp2.next=curr;
                temp2=temp2.next;
            }
            curr = curr.next;
        }
        temp2.next=null;
        temp.next = dummy2.next;
        return dummy.next;

        
    }
}