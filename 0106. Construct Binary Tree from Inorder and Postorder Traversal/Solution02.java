/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 57.33 %
    Runtime : 4 ms
    Memory Usage : 44.4 MB
    Testcase : 202 / 202 passed
    Ranking : 
        Your runtime beats 70.54 % of java submissions.
        Your memory usage beats 44.52 % of java submissions.
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
    Map<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        //need to pivot where the ranges are located
        return dfs(inorder, postorder,postorder.length-1, 0, inorder.length-1);
        
        
    }
    
    
    
    public TreeNode dfs(int[] inorder, int[] postorder, int pos_order, int inorder_start, int inorder_end){
        
        if((inorder_start>inorder_end)) return null;
        TreeNode node = new TreeNode(postorder[pos_order]);
        
        int node_position = map.get(node.val);
       
        //find out rightsize to work out relative index
        int rightsize = inorder_end - node_position;
        //got the calculation for post order wrong
        node.left = dfs(inorder, postorder ,pos_order-rightsize-1, inorder_start , node_position-1);
        node.right = dfs(inorder, postorder, pos_order-1, node_position+1, inorder_end);
        
        return node;
    }
}