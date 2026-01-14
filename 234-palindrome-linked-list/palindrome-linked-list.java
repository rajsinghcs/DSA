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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> res = new Stack<>();
        ListNode temp = head;
        if (head == null || head.next == null){
            return true;
        }
        while(temp!=null){
            res.push(temp.val);
            temp = temp.next;
        }
        while(!res.isEmpty()){
            int stackVal = res.pop();
            if(head.val != stackVal){
                return false;
            }
            else{
                head=head.next;
            }
        }
        return true;
    }
}