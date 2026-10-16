
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        int count = 0;
        ListNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int[] arr = new int[count];
        temp = head;

        for (int i = 0; i < count; i++) {
            arr[i] = temp.val;
            temp = temp.next;
        }

        int[] nums = new int[count];

        for (int i = 0; i < count; i++) {
            nums[i] = 0;

            for (int j = i + 1; j < count; j++) {
                if (arr[j] > arr[i]) {
                    nums[i] = arr[j];
                    break;
                }
            }
        }

        return nums;
    }
}
