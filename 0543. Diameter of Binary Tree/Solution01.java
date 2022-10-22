/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 55.91 %
    Runtime : 1 ms
    Memory Usage : 43.1 MB
    Testcase : 104 / 104 passed
    Ranking : 
        Your runtime beats 77.32 % of java submissions.
        Your memory usage beats 66.58 % of java submissions.
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
    int global_max =0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        if(global_max==0) return 0;
        return global_max-1;
    }
    
    public int dfs (TreeNode root){
        if(root.left==null&&root.right==null){
            return 1;
        }
        
        int curr = 1;
        int left =0;
        int right =0;
        if(root.left!=null){
            left =dfs(root.left);
        }
        if(root.right!=null){
            right =dfs(root.right);
        }
        global_max = Math.max(global_max,(curr+left+right));
        return curr+Math.max(left,right);
    }
}