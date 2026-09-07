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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode temp = new ListNode(0);
        ListNode now = temp;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                now.next=list1;
                list1=list1.next;
            }
            else{
                now.next = list2;
                list2=list2.next;
            }
            now = now.next;
        }
        if(list1!=null){
            now.next = list1;
        }
        else{
            now.next = list2;
        }
        return temp.next;


    }
}