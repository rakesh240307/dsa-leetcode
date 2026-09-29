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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;

        }
        Collections.sort(list);
        ListNode R = new ListNode(0);
        ListNode r = R;
        for(int i = 0 ; i<list.size();i++){
            r.next  =  new ListNode(list.get(i));
            r = r.next;

            
        }
        return R.next;

        
    }
}