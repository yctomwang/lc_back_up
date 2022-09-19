/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 65.41 %
    Runtime : 49 ms
    Memory Usage : 47.2 MB
    Testcase : 33 / 33 passed
    Ranking : 
        Your runtime beats 00.00 % of submissions.
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
    //in order to find the max
    double maxavg=0.0;
    public double maximumAverageSubtree(TreeNode root) {
        int[] lastOne =DFS(root);
       
    return maxavg;
        
    }
    //int[0] is the total value of the tree
    //int[1] is the how many we have
    public int[] DFS(TreeNode node){
        //exit the recursion
        if(node==null){
            return new int[2];
        }
        
        //what we do on current level
        int[] left=DFS(node.left);
        int[] right=DFS(node.right);
        
        int[] total=new int[2];
        total[0]=left[0]+right[0]+node.val;
        total[1]=left[1]+right[1]+1;
        System.out.println(total[0]/total[1]);
        if((double)total[0]/total[1]>maxavg){
            maxavg=(double)total[0]/total[1];
        }
        return total;
    }
}