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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode finalList = new ListNode();
        ListNode res = finalList;

        if(l1== null) return l2;
        if(l2==null) return l1;
        
        int sum = 0, c = 0;

        while(l1 != null || l2 != null || c !=0){
            sum = c;
            if(l1 != null){
                sum += l1.val;
                l1=l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2=l2.next;
            }

            int num = sum%10;
            c = sum/10;

            res.next = new ListNode(num);
            res = res.next;

        }
        return finalList.next;
    }
}