/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 52.65 %
    Runtime : 2 ms
    Memory Usage : 43.1 MB
    Testcase : 198 / 198 passed
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
    public boolean isSymmetric(TreeNode root) {
        boolean truefalse= true;
        Queue<TreeNode> q = new LinkedList<>();
       
        q.offer(root);
        
        while(!q.isEmpty()){
            int qize=q.size();
            //int q2size=q2.size();
            List<TreeNode> leveltreenode= new ArrayList<>();
            for(int i=0;i<qize;i++){
                TreeNode current = q.poll();
                leveltreenode.add(current.left);
                leveltreenode.add(current.right);
                if(current.left!=null){
                    q.offer(current.left);
                }
                if(current.right!=null){
                    q.offer(current.right);
                }
                
            }
            int start=0;
            int end = leveltreenode.size()-1;
            while(start<=end){
                if(leveltreenode.get(start)==null&&leveltreenode.get(end)==null){
                    start++;
                    end--;
                }
                else if(leveltreenode.get(start)==null||leveltreenode.get(end)==null){
                    return false;
                }

                else if(leveltreenode.get(start).val==leveltreenode.get(end).val){
                    start++;
                    end--;
                }
                else{
                    return false;
                }
            }
            
        }
        return true;
    }
}