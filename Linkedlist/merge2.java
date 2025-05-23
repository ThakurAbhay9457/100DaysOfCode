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
        ListNode newList = new ListNode(0);
        ListNode travel = newList;

        while(list1 != null || list2 != null){
            if(list2 == null || list1 != null && list1.val < list2.val){
                travel.next = list1;
                list1 = list1.next;
            }
            else{
                travel.next = list2;
                list2 = list2.next;
            }
            travel = travel.next;
        }
        return newList.next;
    }
}
