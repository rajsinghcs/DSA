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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;

        Stack<ListNode> st = new Stack<>();
        ListNode cur = head;
        while(cur != null){
            st.push(cur);
            cur = cur.next;
        }
        int n = st.size()/2;
        ListNode dummy = head;
        for(int i=0; i<n; i++){
            ListNode right = st.pop();
            ListNode left = dummy.next;
            dummy.next = right;
            right.next = left;
            dummy = left;
        }
        if(dummy != null){
            dummy.next = null;
        }
    }
}