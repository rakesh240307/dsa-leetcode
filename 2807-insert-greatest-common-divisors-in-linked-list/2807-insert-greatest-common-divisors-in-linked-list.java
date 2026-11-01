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
    public int gcd(int a , int b ){
        if(b%a==0){
            return a ;
        }
        return gcd(b%a , a);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        while(temp!=null && temp.next!=null){
            int k = gcd(temp.val , temp.next.val);
            ListNode neww = new ListNode(k);
            neww.next = temp.next;
            temp.next = neww;
            temp = neww.next;

        }
        return head;

        
    }
}