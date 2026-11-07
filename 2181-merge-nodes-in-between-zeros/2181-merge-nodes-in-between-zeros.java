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
    public ListNode mergeNodes(ListNode head) {
        int i = 0 ;
        if(head==null || head.next==null){
            return null;
        }
        if(head.next.next==null)
        {
            return null;
        }
        ListNode temp = head.next;

        ListNode k = new ListNode(0);
         ListNode dummy = k ;
        int sum = 0 ;
        while(temp!=null){
            if(temp.val!=0){
                sum+=temp.val;
            }
            else{
                ListNode t = new ListNode(sum);
                dummy.next = t;
                dummy = dummy.next;
                sum = 0;
            }
            temp = temp.next ;
            

        }
        return k.next;

        
    }
}