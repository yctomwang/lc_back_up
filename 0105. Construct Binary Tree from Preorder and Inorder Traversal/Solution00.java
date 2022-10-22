/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 60.66 %
    Runtime : 4 ms
    Memory Usage : 44.4 MB
    Testcase : 203 / 203 passed
    Ranking : 
        Your runtime beats 74.59 % of java submissions.
        Your memory usage beats 52.19 % of java submissions.
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
    int[] preorder;
    int[] inorder;
    //to store the index of each element
    //è¿éé®ä¸ä¸é¢è¯å®ï¼valueæ¯å¦Unique
    Map<Integer, Integer> map = new HashMap<>();
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        //inorder dfs(left) self, right
        //preorder self , left , right
        this.preorder=preorder;
        this.inorder = inorder;
        //populate  the bloody map
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        
        return buildTree(0,0,inorder.length-1);
        
        
    }
    
    
    private TreeNode buildTree(int preorderidx, int inorderstart, int inorderend){
        //check to see if preorderidx is out of bounds
        if(inorderstart>inorderend) return null;
        TreeNode node = new TreeNode(preorder[preorderidx]);
        int index = map.get(node.val);
        node.left = buildTree(preorderidx+1, inorderstart, index-1);
        node.right = buildTree(preorderidx+1+(index-inorderstart), index+1, inorderend);
        return node;
        
    }
}