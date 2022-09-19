/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 74.65 %
    Runtime : 4 ms
    Memory Usage : 59.5 MB
    Testcase : 63 / 63 passed
    Ranking : 
        Your runtime beats 48.93 % of java submissions.
        Your memory usage beats 67.33 % of java submissions.
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
    
    public void DFS(TreeNode node, int biggest){
        //out entrance of recursion
        if(node.left==null&&node.right==null){
            if(node.val>=biggest){
                count++;
            }
            return;
        }
        
        //what we do on this level
            if(node.val>=biggest){
                count++;
            }
            if(node.left!=null){
                DFS(node.left,Math.max(node.val,biggest));
            }
            
            if(node.right!=null){
                DFS(node.right,Math.max(node.val,biggest));
            }
        //}
        
    }
}