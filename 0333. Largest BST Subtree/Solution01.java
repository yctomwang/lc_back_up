/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 42.12 %
    Runtime : 2 ms
    Memory Usage : 43.3 MB
    Testcase : 73 / 73 passed
    Ranking : 
        Your runtime beats 22.98 % of java submissions.
        Your memory usage beats 74.30 % of java submissions.
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
    public int largestBSTSubtree(TreeNode root) {
        if(root==null) return answer;
        
        dfs(root);
        
        return answer;
    }
    //int[0] is how many
    //int[1] is max
    //int[2] is min
    //int[3] is BST from bottom or not, 0or1, 1 means valid
    private int[] dfs(TreeNode node){
        if(node.left==null&&node.right==null){
            answer=Math.max(answer,1);
            return new int[]{1,node.val,node.val,1};
        }
        //size of the biggest bst on this current level
        int curr=1;
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