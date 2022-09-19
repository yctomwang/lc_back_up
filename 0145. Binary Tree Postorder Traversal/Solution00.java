/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 66.15 %
    Runtime : 0 ms
    Memory Usage : 41.9 MB
    Testcase : 68 / 68 passed
    Ranking : 
        Your memory usage beats 77.50 % of java submissions.
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
    public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> answer = new ArrayList<>();
        
    DFS(root,answer);
    return answer;
    
    }
    public void DFS(TreeNode node, List<Integer> ans){
        if(node==null){return;}
        
        DFS(node.left,ans);
        DFS(node.right,ans);
        ans.add(node.val);
    }
}