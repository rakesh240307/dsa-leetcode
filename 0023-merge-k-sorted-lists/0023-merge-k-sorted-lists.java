class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        ArrayList<Integer> arr = new ArrayList<>();

        // Traverse each linked list
        for (int i = 0; i < lists.length; i++) {

            ListNode head = lists[i];

            while (head != null) {
                arr.add(head.val);
                head = head.next;
            }
        }

        // Sort all values
        Collections.sort(arr);

        // Create the final linked list
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for (int i = 0; i < arr.size(); i++) {
            curr.next = new ListNode(arr.get(i));
            curr = curr.next;
        }

        return dummy.next;
    }
}