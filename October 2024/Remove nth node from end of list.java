/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // Initializing two pointers at the front.
        ListNode back = head;
        ListNode front = head;

        // Temporary variable to store the value of "n".
        int temp = n;

        // Offsetting the "front" pointer by "temp" number of nodes or till "front"
        // exceeds the end of the list.
        // If it reaches end of list, that means "nth" element from the end is the
        // starting element (as given by the restrictions in the question).
        while (temp > 0 && front != null) {
            front = front.next;
            temp--;
        }

        // If n == 1 and "front" exceeds list length, then only one node exists and it
        // is to be removed.
        // This means that an empty linked list is to be returned.
        if (n == 1 && front == null)
            return null;

        // If the front does not move at all, then the first node is to be removed.
        if (front == null && back == head)
            return head.next;

        // If neither of the above case,
        // Starting moving the front and back of the list parallely/simultaneously.
        while (back != null && front != null) {

            // If the next value of the "front" node is null, i.e., front is at last of the
            // linked list, the "back" has reached to the node which comes before the node
            // to be removed.

            // Hence, make the current "back" node skip its next node.
            if (front.next == null) {
                back.next = back.next.next;
                return head;
            }

            // If above condition not reached, move "back" and "front" node by one.
            back = back.next;
            front = front.next;
        }

        // Default case.
        return head;
    }
}