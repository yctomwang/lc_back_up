/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 56.55 %
    Runtime : 1 ms
    Memory Usage : 43 MB
    Testcase : 115 / 115 passed
    Ranking : 
        Your runtime beats 100.00 % of java submissions.
        Your memory usage beats 85.66 % of java submissions.
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
    LinkedList<Integer> tempPath = new LinkedList<>();
    List<List<Integer>> answer = new LinkedList<>();
    int currentSum=0;
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root==null){
            return answer;
        }
        
        currentSum+=root.val;
        tempPath.add(root.val);
        backTrack(root, targetSum);
        return answer;
        
    }
    
    public void backTrack(TreeNode node, int target){
        if(node.left==null&&node.right==null&&currentSum==target){
            answer.add(new LinkedList<>(tempPath));
            return;
        }
        if(node.left!=null){
            currentSum+= node.left.val;
            tempPath.add(node.left.val);
            backTrack(node.left, target);
        }
         
        if(node.left!=null){
            currentSum-= node.left.val;
                tempPath.removeLast();
        }
        if(node.right!=null){
             currentSum+=node.right.val;
            tempPath.add(node.right.val);
                backTrack(node.right, target);
        }
        if(node.right!=null){
                currentSum-=node.right.val;
            tempPath.removeLast();
            }

    }
    
}