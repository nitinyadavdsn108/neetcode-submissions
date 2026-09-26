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
        if (list1 == null)
            return list2;

        if (list2 == null)
            return list1;

        ListNode temp1 = list1;
        ListNode temp2 = list2;
        int count = 0;

        while (temp1 != null) {
            count++;
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            count++;
            temp2 = temp2.next;
        }

        int i = 0;
        ListNode temp = new ListNode();
        ListNode head = new ListNode();

        while (i < count) {
            ListNode newnode = new ListNode();
            if (i == 0) {
                head = newnode;
            }
            temp.next = newnode;
            temp = newnode;
            i++;
        }

        temp = head;
        while (temp != null) {
            System.out.print(temp.val + "-->");
            temp = temp.next;
        }

        ListNode temp3 = head;
        temp1 = list1;
        temp2 = list2;

        while (temp1 != null && temp2 != null) {
            if (temp1.val < temp2.val) {
                temp3.val = temp1.val;
                temp1 = temp1.next;
                temp3 = temp3.next;
            }

            else {
                temp3.val = temp2.val;
                temp2 = temp2.next;
                temp3 = temp3.next;
            }
        }

        while (temp1 != null) {
            temp3.val = temp1.val;
            temp1 = temp1.next;
            temp3 = temp3.next;
        }

        while (temp2 != null) {
            temp3.val = temp2.val;
            temp2 = temp2.next;
            temp3 = temp3.next;
        }

        return head;
    }
}