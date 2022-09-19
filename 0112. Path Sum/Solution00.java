/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 46.52 %
    Runtime : 0 ms
    Memory Usage : 41.9 MB
    Testcase : 117 / 117 passed
    Ranking : 
        Your runtime beats 100.00 % of java submissions.
        Your memory usage beats 99.17 % of java submissions.
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
    int currentSum=0;
    boolean global = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return global;
        }
        currentSum+=root.val;
        backTrack(root, targetSum);
    
        
        return global;
        
    }
    
    public void backTrack(TreeNode node, int target){
        //dealing with this base case 
        //System.out.println(currentSum);
        if(node.left==null&&node.right==null&&currentSum==target){
            global = true;
            return;
        }
        if(node.left!=null){
            currentSum+= node.left.val;
            backTrack(node.left, target);
        }
         
        if(node.left!=null){
                currentSum-=node.left.val;
        }
        if(node.right!=null){
             currentSum+=node.right.val;
                backTrack(node.right, target);
        }
        if(node.right!=null){
                currentSum-=node.right.val;
            }
//         for(int i=0; i<2;i++){
//             if(i==0&&node.left!=null){
//                 currentSum+= node.left.val;
//                 backTrack(node.left, target);
//             }else if(i==1&&node.right!=null){
//                 currentSum+=node.right.val;
//                 backTrack(node.right, target);
//             }
            
//             if(i==0&&node.left!=null){
//                 currentSum-=node.left.val;
//             }else if(i==1&&node.right!=null){
//                 currentSum-=node.right.val;
//             }
//         }
    }
}