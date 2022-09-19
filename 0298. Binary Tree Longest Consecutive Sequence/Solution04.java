/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 52.36 %
    Runtime : 1 ms
    Memory Usage : 51.5 MB
    Testcase : 53 / 53 passed
    Ranking : 
        Your runtime beats 100.00 % of java submissions.
        Your memory usage beats 14.49 % of java submissions.
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
        backTrack(root,root.val-1,0);
        
        return max+1;
    }
    
    public void backTrack(TreeNode node, int parentval, int len){
        if(node==null)return;
        if(node.val-parentval==1){
            backTrack(node.left,node.val,len+1);
            backTrack(node.right,node.val,len+1);
            max=Math.max(len,max);
        }else{
            backTrack(node.left,node.val,1);
            backTrack(node.right,node.val,1);
        }
    }
}