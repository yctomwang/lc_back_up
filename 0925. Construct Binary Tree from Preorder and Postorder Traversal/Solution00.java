/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 70.75 %
    Runtime : 3 ms
    Memory Usage : 43.5 MB
    Testcase : 306 / 306 passed
    Ranking : 
        Your runtime beats 46.92 % of java submissions.
        Your memory usage beats 71.08 % of java submissions.
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
    //preorder is self, left, right
    //post order is left, right, self
    Map<Integer, Integer> map = new HashMap<>();
    
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        for(int i=0;i<postorder.length;i++){
            map.put(postorder[i],i);
        }
        return buildTree(preorder, postorder, 0, 0, postorder.length-1);
    }
    
    
    public TreeNode buildTree(int[] preorder, int[] postorder, int preorder_idx, int post_start, int post_end){
        //exit condidtion
        //check of index out of range
        if(post_start>post_end) return null;
        TreeNode root = new TreeNode(preorder[preorder_idx]);
        //System.out.println(root.val);
        //start of the left is preorder_idx+1;
        if(preorder_idx+1==preorder.length||post_start==post_end) return root;
        int left_value = preorder[preorder_idx+1];
        //post order end
        int left_start_index = map.get(left_value);
        root.left = buildTree(preorder, postorder,preorder_idx+1,post_start,left_start_index);
        root.right= buildTree(preorder, postorder,preorder_idx+1+(left_start_index-post_start+1),left_start_index+1,post_end-1);
        
        return root;
    }
}