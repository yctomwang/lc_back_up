/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 61.02 %
    Runtime : 1 ms
    Memory Usage : 42.2 MB
    Testcase : 225 / 225 passed
    Ranking : 
        Your runtime beats 83.67 % of java submissions.
        Your memory usage beats 78.49 % of java submissions.
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
    public void flatten(TreeNode root) {
        if(root ==null) return;
        //ä½¿ç¨åè§£çæè·¯å»å
        
        //first flatten the left
        //flatten the right
        //hook up them
        flatten(root.left);
        flatten(root.right);
        TreeNode left = root.left;
        TreeNode right = root.right;
        
        root.left=null;
        root.right = left;
        //save the variable
        TreeNode p = root;
        
        while(p.right!=null){
            p=p.right;
        }
        p.right = right;//hook up with line 27
        //while loop to 
    }
}