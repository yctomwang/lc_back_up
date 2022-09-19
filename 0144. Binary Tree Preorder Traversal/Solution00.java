/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 64.24 %
    Runtime : 0 ms
    Memory Usage : 40.6 MB
    Testcase : 69 / 69 passed
    Ranking : 
        Your memory usage beats 88.75 % of java submissions.
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        DFS(root,answer);
        return answer;
    }
    
    public void DFS(TreeNode node, List<Integer> answer){
        if(node==null){
            return;
        }
        answer.add(node.val);
        DFS(node.left,answer);
        DFS(node.right,answer);
        
    }
}