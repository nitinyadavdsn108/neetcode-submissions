class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode backward = head;
        ListNode forward = new ListNode();
        if (backward != null) {
            forward = backward.next;
        }
        while (forward != null) {
            ListNode temp = forward.next;
            forward.next = backward;
            backward = forward;
            forward = temp;
        }

        if (head != null) {
            head.next = null;
            return backward;
        }else{
            return head;
        }

        

        // backward in the end wiil act as head of last node
    }
}