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
    public ListNode swapPairs(ListNode head) {
        if(head==null) return null;
        ListNode n=head;
        while(n!=null && n.next!=null){
            int temp=n.val;// for swapping two values
            n.val=n.next.val;
            n.next.val=temp;

            n=n.next.next;// for skipping swapped values
        }
        return head;
    }
}
