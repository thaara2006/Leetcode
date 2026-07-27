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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val != q.val) return false;
        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
        //return in(p,q);
    }
    // public boolean in(TreeNode p, TreeNode q){
    //     if(p==null || q==null) return false;
    //     boolean f=in(p.left,q.left);
    //     boolean t=in(p.right,q.right);
    //     return f&&t;
    // }
}