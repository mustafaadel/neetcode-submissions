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
    public ListNode reverseList(ListNode head) {
       // base case
        // Stop when you reach the final node
        if(head == null || head.next == null){return head;}
        // returned newHead is the final node found
        ListNode newHead = reverseList(head.next);
        // here head and head.next.next is the final node will be the node which it's next node is the final node
        head.next.next = head;
        // set the next of the before final node to null
        head.next = null;
        return newHead; 
    }
}
