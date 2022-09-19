/*
Submission Detail:{
    Difficulty : Hard
    Acceptance Rate : 38.26 %
    Runtime : 52 ms
    Memory Usage : 50.2 MB
    Testcase : 94 / 94 passed
    Ranking : 
        Your runtime beats 00.00 % of submissions.
        Your memory usage beats 00.00 % of submissions.
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
    int maxanswer=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
       
        DFS(root);
        
    return maxanswer;
    }
    
    public int DFS(TreeNode node){
        //out
        if(node.left==null&&node.right==null){
            if(node.val>maxanswer){
                maxanswer=node.val;
            }
            return node.val;
        }
        int leftnum=0;
        int rightnum=0;
        if(node.left!=null)
        leftnum=DFS(node.left);
        if(node.right!=null)
        rightnum=DFS(node.right);
        
        if(leftnum<0) leftnum=0;
        if(rightnum<0) rightnum=0;
        //deal with current level
        if((node.val+leftnum+rightnum)>maxanswer){
            maxanswer=node.val+leftnum+rightnum;
        }
        System.out.println(leftnum);
        return node.val+Math.max(leftnum,rightnum);
        
        
    }
}