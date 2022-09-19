/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 71.51 %
    Runtime : 3 ms
    Memory Usage : 43.9 MB
    Testcase : 66 / 66 passed
    Ranking : 
        Your runtime beats 78.63 % of java submissions.
        Your memory usage beats 89.66 % of java submissions.
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
    public List<Double> averageOfLevels(TreeNode root) {
    List<Double> levelList= new ArrayList<>();
    //STANDARD BFS question
    Queue<TreeNode> q = new LinkedList<>();
    q.offer(root);
    while(!q.isEmpty()){
        int qsize=q.size();
        
        Double levelsum=0.0;
        Double levelnum=(double)qsize;
        for(int i=0;i<qsize;i++){
            TreeNode curr=q.poll();
            levelsum+=(double)curr.val;
            if(curr.left!=null){
                q.offer(curr.left);
                
            }
            if(curr.right!=null){
                q.offer(curr.right);
            }
        }
        levelList.add(levelsum/levelnum);
    }
    return levelList;
        
    }
}