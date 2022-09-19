/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 49.43 %
    Runtime : 1 ms
    Memory Usage : 44.1 MB
    Testcase : 157 / 157 passed
    Ranking : 
        Your memory usage beats 73.88 % of java submissions.
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
    
    int max =0;
    public int longestConsecutive(TreeNode root) {
        dfs(root);
        if(root.left==null&&root.right==null){
            return 1;
        }
        return max;
    }
    // int[0] is increasing
    //int[1] is decreasing 
    private int[] dfs(TreeNode node){
        //base case
        if(node.left==null&&node.right==null){
            
            return new int[]{1,1};
        }
        int maxIrc =1;
        int maxDrc =1;
        if(node.left!=null){
            int[] leftAns=dfs(node.left);
            if(Math.abs(node.val-node.left.val)==1){
                if(node.val<node.left.val){
                    //System.out.println("left"+leftAns[0]+1);
                    maxDrc=Math.max(leftAns[0]+1,maxDrc);
                }
                else if(node.val>node.left.val){
                    maxIrc = Math.max(leftAns[1]+1,maxIrc);
                }
            }
            
        }
        
        if(node.right!=null){
            int[] rightAns= dfs(node.right);
            if(Math.abs(node.val-node.right.val)==1){
                if(node.val<node.right.val){
                    maxDrc=Math.max(rightAns[0]+1,maxDrc);
                }
                else if(node.val>node.right.val){
                    maxIrc = Math.max(rightAns[1]+1,maxIrc);
                }
            }
        }
        
        // System.out.println(node.val);
        // System.out.println(maxIrc);
        // System.out.println(maxDrc);
        // System.out.println("+++++");
        
        max=Math.max(max,maxDrc+maxIrc-1);
        
        return new int[]{maxDrc,maxIrc};
        
        
        //check for child parent child
        //return 
    }
}