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
 import java.math.BigInteger;

class Solution {
    public int getDecimalValue(ListNode head) {
        StringBuilder s = new StringBuilder();
        while(head != null){
              s.append(head.val);
              head=head.next;
        }
          BigInteger bigInt = new BigInteger(s.toString(), 2);
        return bigInt.intValue();     
    }
}