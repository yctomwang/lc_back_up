/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 55.15 %
    Runtime : 1 ms
    Memory Usage : 42.5 MB
    Testcase : 201 / 201 passed
    Ranking : 
        Your memory usage beats 32.42 % of java submissions.
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
    int count=0;
    public int countUnivalSubtrees(TreeNode root) {
        if(root==null) return count;
        dfs(root);
        return count;
    }
    
    private int dfs(TreeNode root){
        if(root.left==null&&root.right==null){
            count++;
            return root.val;
        }
        int currVal= root.val;
        int leftVal=root.val;
        int rightVal=root.val;
        if(root.left!=null){
            leftVal=dfs(root.left);
        }
        
        if(root.right!=null){
            rightVal=dfs(root.right);
        }
        if(leftVal!=-1001&&rightVal!=-1001){
            if(currVal==leftVal&&currVal==rightVal){
                count++;
                return root.val;
            }
        }
        return -1001;
    }
}