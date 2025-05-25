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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0)return head;
        ListNode xyz=head;
        ListNode abc=head;
        int a=0;
        int size=0;
        while(xyz!=null){
            xyz=xyz.next;
            size++;
        }
        xyz=head;
        k=k%size;
        while(xyz.next!=null){
            xyz=xyz.next;
            a++;
            if(a>k)abc=abc.next;
        }
        xyz.next=head;
        head=abc.next;
        abc.next=null;
        
        return head;
        
    }
}
