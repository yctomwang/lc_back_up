/*
Submission Detail:{
    Difficulty : Hard
    Acceptance Rate : 38.26 %
    Runtime : 1 ms
    Memory Usage : 47.7 MB
    Testcase : 94 / 94 passed
    Ranking : 
        Your runtime beats 99.76 % of java submissions.
        Your memory usage beats 62.16 % of java submissions.
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
        if(node.left!=null){leftnum=DFS(node.left);}
        
        if(node.right!=null){ rightnum=DFS(node.right);}
       
        
        // if(leftnum<0) leftnum=0;
        // if(rightnum<0) rightnum=0;
        //deal with current level
        if((node.val+Math.max(leftnum,0)+Math.max(rightnum,0))>maxanswer){
            maxanswer=node.val+Math.max(leftnum,0)+Math.max(rightnum,0);
        }
       
        return node.val+Math.max(Math.max(leftnum,0),Math.max(rightnum,0));
        
        
    }
}