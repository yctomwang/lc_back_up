/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 58.33 %
    Runtime : 0 ms
    Memory Usage : 41.6 MB
    Testcase : 108 / 108 passed
    Ranking : 
        Your runtime beats 100.00 % of java submissions.
        Your memory usage beats 55.41 % of java submissions.
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
    //backtracking
    //public int curr=0;
    public int sum=0;
    public int sumNumbers(TreeNode root) {
        
        backTrack(root,0);
        
        return sum;
    }
    
    public void backTrack(TreeNode node ,int val){
        //exist
        if(node.left==null&&node.right==null){
            //System.out.println(10*val+node.val);
            sum+=10*val+node.val;
            return;
        }
        if(node.left!=null){
            backTrack(node.left,10*val+node.val);
        }
        if(node.right!=null){
            backTrack(node.right, 10*val+node.val);
        }
        
    }
}