/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> ans = new ArrayList();
    public List<Integer> rightSideView(TreeNode root) {
        traversal(root, 0);
        return ans;
    }
        void traversal(TreeNode root , int index){
            if(root==null) return ;
            if(ans.size()<= index){
                ans.add(root.val);
            }
        traversal(root.right, index+1);
        traversal(root.left, index+1);
    }
}