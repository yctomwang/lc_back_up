/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 69.03 %
    Runtime : 6 ms
    Memory Usage : 43.3 MB
    Testcase : 93 / 93 passed
    Ranking : 
        Your runtime beats 8.04 % of java submissions.
        Your memory usage beats 86.53 % of java submissions.
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
    ArrayList<Integer> answer = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        backTrack(root);
        System.out.println(answer);
        
        for(int i=0;i<answer.size();i++){
            if(i==k-1){
                return answer.get(i);
            }
        }
        return 0;
    }
    
    public void backTrack(TreeNode node){
        if(node==null){
            return;
        }
        
        backTrack(node.left);
        
        answer.add(node.val);
        
        backTrack(node.right);
    }
}