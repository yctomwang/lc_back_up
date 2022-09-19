/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 54.87 %
    Runtime : 1 ms
    Memory Usage : 42.8 MB
    Testcase : 33 / 33 passed
    Ranking : 
        Your runtime beats 96.62 % of java submissions.
        Your memory usage beats 54.18 % of java submissions.
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> answer= new ArrayList<>();
        //deal with corner case
        
        if(root==null){
            return answer;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        int level=0;
        
        q.offer(root);
        
        while(!q.isEmpty()){
            int qize= q.size();
            level+=1;
            List<Integer> levelanswer = new ArrayList<>();
            for(int i=0; i<qize;i++){
                TreeNode current = q.poll();
                if(level%2==0){
                    levelanswer.add(0,current.val);
                }
                else{
                    levelanswer.add(current.val);
                }
                if(current.left!=null){
                    q.offer(current.left);
                }
                if(current.right!=null){
                    q.offer(current.right);
                }
                
            }
            answer.add(levelanswer);
            
        }
        
        return answer;
    }
}