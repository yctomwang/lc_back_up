/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 61.02 %
    Runtime : 2 ms
    Memory Usage : 42.5 MB
    Testcase : 215 / 215 passed
    Ranking : 
        Your runtime beats 47.48 % of java submissions.
        Your memory usage beats 72.51 % of java submissions.
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        //create a queue
        Queue<TreeNode> q = new LinkedList<>();
        //deal with edge case
        if(root==null){
            return answer;
        }
        //add the item into the queue
        q.offer(root);
        //loop whilst the queue is not empty
        while(!q.isEmpty()){
            int qSize= q.size();
            //to loop throough a level
            for(int i=0; i<qSize;i++){
                TreeNode current = q.poll();
                if(i==qSize-1){
                    answer.add(current.val);
                    
                }
                if(current.left!=null){
                    q.offer(current.left);
                }
                if(current.right!=null){
                    q.offer(current.right);
                }
            }
        }
        
        return answer;
    }
}