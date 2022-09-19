/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 70.53 %
    Runtime : 1 ms
    Memory Usage : 45.4 MB
    Testcase : 81 / 81 passed
    Ranking : 
        Your runtime beats 85.38 % of java submissions.
        Your memory usage beats 12.51 % of java submissions.
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
    
    class Pair{
        TreeNode node;
        int depth;
        
        Pair(TreeNode node, int depth){
            this.node=node;
            this.depth=depth;
        }
    }
    
    //do top down to find the  deepest leaves
    private Pair backTrack(TreeNode node, int height){
        if(node==null) return new Pair(null,height);
        Pair left=backTrack(node.left,height+1);
        Pair right=backTrack(node.right,height+1);
        
        if(left.depth==right.depth){
            return new Pair(node,left.depth);
        }else{
            return left.depth>right.depth?left:right;
        }
    }
    
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        Pair answer =backTrack(root,0);
        return answer.node;
    }
    
    
    
}