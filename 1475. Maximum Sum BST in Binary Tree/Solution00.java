/*
Submission Detail:{
    Difficulty : Hard
    Acceptance Rate : 39.09 %
    Runtime : 11 ms
    Memory Usage : 80.4 MB
    Testcase : 58 / 58 passed
    Ranking : 
        Your runtime beats 84.21 % of java submissions.
        Your memory usage beats 7.99 % of java submissions.
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
    private int answer=0;
    public int maxSumBST(TreeNode root) {
         if(root==null) return answer;
        
        dfs(root);
        
        return answer;
        
    }
    
        private int[] dfs(TreeNode node){
        if(node.left==null&&node.right==null){
            answer=Math.max(answer,node.val);
            return new int[]{node.val,node.val,node.val,1};
        }
        //size of the biggest bst on this current level
        int curr=node.val;
        boolean right=true;
        boolean left=true;
        int max= node.val;
        int min = node.val;
        if(node.left!=null){
        // call dfs on left children
            int[] leftAns=dfs(node.left);
            //check if left children is valid or not
            left=false;
            if(leftAns[1]<max&&leftAns[3]==1){
                left=true;
                curr+=leftAns[0];
                max=Math.max(max,leftAns[1]);
                min=Math.min(min,leftAns[2]);
            }
        }
        
        if(node.right!=null){
            int[] rightAns=dfs(node.right);
            right=false;
            if(rightAns[2]>max&&rightAns[3]==1){
                right=true;
                curr+=rightAns[0];
                max=Math.max(max,rightAns[1]);
                min=Math.min(min,rightAns[2]);
            }
        }
        //check current level's value against left children's larget and right children's smallest
        //then return 
        if(left&&right){
            answer=Math.max(answer,curr);
            return new int[]{curr,max,min,1};
        }else{
            //this whole branch is cutt off and parents are also invalid 
            return new int[]{1,0,0,0};
        }
       
        
        
    }
}