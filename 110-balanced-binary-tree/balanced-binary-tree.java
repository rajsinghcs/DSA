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
    public boolean isBalanced(TreeNode root) {

        return checkHeightDifference(root) != -1;
    }

    public int checkHeightDifference(TreeNode node){
        if(node == null) return 0;

        int leftNode = checkHeightDifference(node.left);
        int rightNode = checkHeightDifference(node.right);

        if(leftNode == -1 || rightNode == -1 || Math.abs(leftNode - rightNode) > 1){
            return -1;
        }

        return Math.max(leftNode, rightNode) + 1;
    }
}