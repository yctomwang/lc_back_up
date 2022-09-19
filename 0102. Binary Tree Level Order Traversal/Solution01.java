/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 62.94 %
    Runtime : 2 ms
    Memory Usage : 43.7 MB
    Testcase : 34 / 34 passed
    Ranking : 
        Your runtime beats 39.25 % of java submissions.
        Your memory usage beats 44.02 % of java submissions.
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        //creat queue
        Queue<TreeNode> q= new LinkedList<>();
        Set<TreeNode> visited;
        List<List<Integer>> answer= new ArrayList<>();
        //put start into queue
        if(root!=null)
        q.offer(root);
        
        while(!q.isEmpty()){
            int sizeofQ=q.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0;i<sizeofQ;i++){
                TreeNode current= q.poll();
                if(current!=null){level.add(current.val);
                if(current.left!=null){
                    q.offer(current.left);
                }
                if(current.right!=null){
                    q.offer(current.right);
                }}
                
            }
            //this level finished
            answer.add(level);
        }
        
        return answer;
        
    }
}