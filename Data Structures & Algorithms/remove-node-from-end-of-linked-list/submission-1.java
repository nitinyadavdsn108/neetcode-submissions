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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // traverse and count totol number of noes present
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }

        
        // if there is only one node
        if(count == 1){
            head = null;
            return head;
        }

        // calculae the list to be deleted from starting
        int target = count - n + 1;
        count = 1;

        ListNode fast = head;
        ListNode slow = head;



        while (fast != null) {
            
            if(target == 1){
                head = head.next;
                return head;
            }
            if (count == target) {
                slow.next = fast.next;
                fast.next = null;
                break;
            }
            
            slow = fast;
            fast = fast.next;
            count++;
        }


        return head;
    }
}
