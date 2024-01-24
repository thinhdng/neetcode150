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
        ListNode curr = head; //put the current node at the head of the list
        ListNode prev = null; //previous node is set to null (null <- head ->item)
        while(curr != null){
            ListNode nxt = curr.next; //next node is saved in next
            curr.next = prev; // curr pointer is moved backwards
            prev = curr; //move prev to curr
            curr = nxt; //move curr to next
        }

        return prev;
    }
}

//time complexity = O(n)
//space complexity = O(1)