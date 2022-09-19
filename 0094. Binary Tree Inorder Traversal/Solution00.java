/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 72.70 %
    Runtime : 0 ms
    Memory Usage : 40.6 MB
    Testcase : 70 / 70 passed
    Ranking : 
        Your memory usage beats 90.62 % of java submissions.
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
    List<Integer> answer = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null){
            return answer;
        }
        dfs(root);
        return answer;
    }
    
    private void dfs(TreeNode root){
        if(root==null){
            return;
        }
        dfs(root.left);
        answer.add(root.val);
        
        dfs(root.right);
        
    }
}