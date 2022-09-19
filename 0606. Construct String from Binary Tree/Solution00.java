/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 63.47 %
    Runtime : 1 ms
    Memory Usage : 42 MB
    Testcase : 160 / 160 passed
    Ranking : 
        Your runtime beats 100.00 % of java submissions.
        Your memory usage beats 98.38 % of java submissions.
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
    StringBuilder s1 = new StringBuilder();
    public String tree2str(TreeNode root) {
    
    dfs(root);
    return s1.toString();
    }
    
    public void dfs(TreeNode node){
        if(node.left==null&&node.right==null){
            s1.append(node.val);
            return;
        }
        s1.append(node.val);
        if(node.left!=null){
            s1.append('(');
            //s1.append("hi"+node.val);
            dfs(node.left);
            s1.append(')');
        }
        
        if(node.right!=null){
            if(node.left==null){
                s1.append('(');
                s1.append(')');
            }
            s1.append('(');
            //s1.append("hi"+node.val);
            dfs(node.right);
            s1.append(')');
        }
        
    }
}