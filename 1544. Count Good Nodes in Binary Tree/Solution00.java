/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 74.65 %
    Runtime : 4 ms
    Memory Usage : 59.6 MB
    Testcase : 63 / 63 passed
    Ranking : 
        Your runtime beats 48.93 % of java submissions.
        Your memory usage beats 61.37 % of java submissions.
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
    
    public int goodNodes(TreeNode root) {
        DFS(root,Integer.MIN_VALUE);
        return count;
    }
    
    private void DFS(TreeNode node, int biggest){
        if(node==null){
            return;
        }
        
        if(node.val>=biggest){
            count++;
        }
        DFS(node.left,Math.max(biggest,node.val));
        DFS(node.right,Math.max(biggest,node.val));
    }
}