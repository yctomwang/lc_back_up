/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 31.58 %
    Runtime : 1 ms
    Memory Usage : 44.1 MB
    Testcase : 80 / 80 passed
    Ranking : 
        Your runtime beats 58.97 % of java submissions.
        Your memory usage beats 32.67 % of java submissions.
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
    boolean flag=true;
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        
        isBTS(root);
        
        return flag;
    }
        //int[0] is the min, int[1] is the max
    public int[] isBTS(TreeNode node){
        //base case
        if(node.left==null&&node.right==null){
            return new int[]{node.val,node.val};
        }
       
        int max=node.val;
        int min=node.val;
        if(node.left!=null){
            int[] leftRes=isBTS(node.left);
            if(leftRes[1]>=node.val){
                flag=false;
            }
            max=Math.max(max,leftRes[1]);
            min=Math.min(min,leftRes[0]);
        }
        
        if(node.right!=null){
            int[] rightRes=isBTS(node.right);
            if(rightRes[0]<=node.val){
                flag=false;
            }
            max=Math.max(max,rightRes[1]);
            min=Math.min(min,rightRes[0]);
        }
        
        return new int[]{min,max};
        
    }
    
}