/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 72.90 %
    Runtime : 1 ms
    Memory Usage : 43.1 MB
    Testcase : 39 / 39 passed
    Ranking : 
        Your runtime beats 24.79 % of java submissions.
        Your memory usage beats 56.19 % of java submissions.
}
*/

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
    public int maxDepth(TreeNode root) {
        if(root==null){return 0;}
        
        int left= maxDepth(root.left);
        int right= maxDepth(root.right);
        int max_depth= Math.max(left,right)+1;
        
        
        return max_depth;
        
    }
    
}