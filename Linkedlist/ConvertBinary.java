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
    public int getDecimalValue(ListNode head) {
        
        int decVal = 0;
        while(head != null){
            decVal = decVal << 1;
            decVal = decVal + head.val;
            head = head.next;
        }
        return decVal;
    }
}
