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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode Head=head;
        if(Head==null){
            return head;
        }
        while(Head.next != null ){
            if(Head.val == Head.next.val){
                Head.next = Head.next.next;
            }else{
              Head = Head.next;
            }
        }
        return head;
    }
}