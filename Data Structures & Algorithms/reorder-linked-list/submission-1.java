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
        // applying fast and slow pointer approach to get the middle node
        if (head.next == null) {
            return;
        }
        ListNode slow = head;
        ListNode fast = head;
        int count = 0;
        while (slow != null) {
            slow = slow.next;
            count++;
        }

        slow = head;

        if (count % 2 == 0) {
            while (fast != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
        } else {
            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
        }
        // as fast is twice faster then slow , when fast reaches the end of list slow would be
        // pointing exatly at the middle node

        // now reverse the second half list starting from slow.next node
        ListNode head2 = slow.next;
        ListNode backward = head2;

        ListNode forward = new ListNode();
        if (head2 != null) {
            forward = head2.next;
        } else {
            // list contains only two elements
            return;
        }
        while (forward != null) {
            ListNode temp = forward.next;
            forward.next = backward;
            backward = forward;
            forward = temp;
        }
        // breaking the second reversed list from the first by doing
        head2.next = null;
        slow.next = null;
        // assing new head value which is starting from the back of the list
        head2 = backward;

        ListNode stepnode1 = head;
        ListNode stepnode2 = head2;
        ListNode temp = new ListNode();
        while ((stepnode1 != null) && (stepnode2 != null)) {
            temp = stepnode1.next;
            stepnode1.next = stepnode2;
            stepnode1 = temp;

            if (stepnode1 != null) {
                temp = stepnode2.next;
                stepnode2.next = stepnode1;
                stepnode2 = temp;
            }
        }
    }
}
