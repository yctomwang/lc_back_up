/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 52.36 %
    Runtime : 2 ms
    Memory Usage : 50.7 MB
    Testcase : 53 / 53 passed
    Ranking : 
        Your runtime beats 49.60 % of java submissions.
        Your memory usage beats 70.22 % of java submissions.
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
    public int max=0;
    public int longestConsecutive(TreeNode root) {
        backTrack(root,root.val+1,1);
        
        return max;
    }
    
    public void backTrack(TreeNode node, int parentval, int len){
        max=Math.max(len,max);
        if(node==null)return;
        if(node.val-parentval==1){
            
            backTrack(node.left,node.val,len+1);
            backTrack(node.right,node.val,len+1);
            
        }else{
            backTrack(node.left,node.val,1);
            backTrack(node.right,node.val,1);
        }
    }
}