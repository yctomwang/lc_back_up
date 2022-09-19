/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 72.65 %
    Runtime : 0 ms
    Memory Usage : 42.1 MB
    Testcase : 30 / 30 passed
    Ranking : 
        Your memory usage beats 22.93 % of java submissions.
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
    public TreeNode pruneTree(TreeNode root) {
        
        
        dfs(root);
        //corner case of all 0's
        if(root.left==null&&root.right==null){
            if(root.val==0){
                return null;
            }
        }
        return root;
    }
    
    
    public boolean dfs(TreeNode node){
        //base case 
        if(node.left==null&&node.right==null){
            if(node.val==1){
                return true;
            }else{
                return false;
            }
        }
        boolean leftFlag=false;
        boolean rightFlag=false;
        if(node.left!=null){
            leftFlag = dfs(node.left);
           
        }
        if(node.right!=null){
            rightFlag = dfs(node.right);
        }
        
        if(leftFlag || rightFlag){
            if(leftFlag==false){
                node.left=null;
            }
            if(rightFlag==false){
                node.right=null;
            }
            return true;
        }
        if(node.val!=0){
            node.left=null;
            node.right=null;
            return true;
            
        }
        node.left=null;
        node.right=null;
        return false;
        
        
    }
}