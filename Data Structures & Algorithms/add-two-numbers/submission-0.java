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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode head = new ListNode();
        ListNode temp3 = head;
        int sum = 0;
        int carry = 0;

        while (temp1 != null && temp2 != null) {
            sum = (temp1.val + temp2.val) + carry;
            carry = sum / 10;
            System.out.println(sum + "... " + carry);
            ListNode newnode = new ListNode();
            newnode.val = sum % 10;
            temp3.next = newnode;
            temp3 = newnode;

            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        while (temp1 != null) {
            sum = temp1.val + carry;
            carry = sum / 10;

            ListNode newnode = new ListNode();
            newnode.val = sum % 10;
            temp3.next = newnode;
            temp3 = newnode;

            temp1 = temp1.next;

        }

        while (temp2 != null) {
            sum = temp2.val + carry;
            carry = sum / 10;

            ListNode newnode = new ListNode();
            newnode.val = sum % 10;
            temp3.next = newnode;
            temp3 = newnode;

            temp2 = temp2.next;

        }

        if (carry > 0) {
            ListNode newnode = new ListNode();
            newnode.val = carry;
            temp3.next = newnode;
            temp3 = newnode;

        }

        return head.next;

    }

}