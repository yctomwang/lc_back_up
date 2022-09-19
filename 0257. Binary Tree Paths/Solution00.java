/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 60.18 %
    Runtime : 17 ms
    Memory Usage : 43.6 MB
    Testcase : 208 / 208 passed
    Ranking : 
        Your runtime beats 13.53 % of java submissions.
        Your memory usage beats 28.42 % of java submissions.
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
    List<String> answer= new LinkedList<>();
    public List<String> binaryTreePaths(TreeNode root) {
         DFS(root,answer,String.valueOf(root.val));
        
        return answer;
        
    }
    
    public void DFS(TreeNode node, List<String> list1, String path ){
        //chu kou
        if(node.left==null&&node.right==null){
            answer.add(path);
            return;
        }
        
        //what we can do at this level
        if(node.right!=null)
        DFS(node.right,list1,path+"->"+node.right.val);
        if(node.left!=null)
        DFS(node.left,list1,path+"->"+node.left.val);
    }
}