/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 79.99 %
    Runtime : 1 ms
    Memory Usage : 42.5 MB
    Testcase : 67 / 67 passed
    Ranking : 
        Your runtime beats 67.04 % of java submissions.
        Your memory usage beats 44.42 % of java submissions.
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
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> findLeaves(TreeNode root) {
        dfs(root);
        
        return ans;
    }
    
    public int dfs(TreeNode root){
        if(root==null){
            return -1;
        }
        
        int leftDepth= dfs(root.left);
        int rightDepth = dfs(root.right);
        
        int currentDepth = Math.max(leftDepth,rightDepth)+1;
        
        if(ans.size()==currentDepth){
            
                ans.add(new ArrayList<>());
            
            
        }
        ans.get(currentDepth).add(root.val);
        return currentDepth;
    }
    
    
}