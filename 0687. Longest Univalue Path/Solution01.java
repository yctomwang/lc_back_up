/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 39.96 %
    Runtime : 4 ms
    Memory Usage : 66.9 MB
    Testcase : 71 / 71 passed
    Ranking : 
        Your runtime beats 59.57 % of java submissions.
        Your memory usage beats 80.22 % of java submissions.
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
    int globalMax=0;
    public int longestUnivaluePath(TreeNode root) {
        if(root==null){
            return 0;
        }
        dfs(root);
        
        return Math.max(0,globalMax-1);
    }
    
    
    private int dfs(TreeNode node){
        if(node.left==null&&node.right==null){
            return 1;
        }
        int right=1;
        int left=1;
        if(node.left!=null){
            int leftLength=dfs(node.left);
            if(node.val==node.left.val){
                left+=leftLength;
            }
        }
        if(node.right!=null){
            int rightLength=dfs(node.right);
            if(node.val==node.right.val){
                right+=rightLength;
            }
        }
        globalMax=Math.max(globalMax,right+left-1);
        
        return Math.max(right,left);
        
    }
}