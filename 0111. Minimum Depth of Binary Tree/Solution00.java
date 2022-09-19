/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 43.32 %
    Runtime : 1 ms
    Memory Usage : 89.4 MB
    Testcase : 52 / 52 passed
    Ranking : 
        Your runtime beats 98.12 % of java submissions.
        Your memory usage beats 65.57 % of java submissions.
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
    public int minDepth(TreeNode root) {
        int minDepth=0;
        //deal with edge cases right here
        //once a node reaches the end, we return that level
        if(root==null){
            return minDepth;
        }
        //create a queue
        Queue<TreeNode> q = new LinkedList<>();
        //whilst the queue is not empty
        q.offer(root);
        while(!q.isEmpty()){
            int qSize= q.size();
            minDepth+=1;
            for(int i=0;i<qSize;i++){
                TreeNode current=q.poll();
                if(current.left!=null){
                    q.offer(current.left);
                }
                if(current.right!=null){
                    q.offer(current.right);
                }
                if(current.left==null&&current.right==null){
                    return minDepth;
                }
            }
            
        }
        
        
        return minDepth;
        
    }
}