/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 68.24 %
    Runtime : 30 ms
    Memory Usage : 105.2 MB
    Testcase : 56 / 56 passed
    Ranking : 
        Your runtime beats 42.51 % of java submissions.
        Your memory usage beats 76.72 % of java submissions.
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
    int answer=0;
    public int pseudoPalindromicPaths (TreeNode root) {
    //using a map to counter the occurence of each type of character...  
    //since 1 to 9, could even use int array 
        int[] occurrence =new  int[9];
        dfs(root,occurrence);
        
        return answer; 
    }
    
    
    private void dfs(TreeNode node, int[] occurrence){
        //exit condition
        //A,b,b,b,b,b,c,c,c
        if(node.left==null&&node.right==null){
            int occur =occurrence[node.val-1];
            occurrence[node.val-1]=occur+1;
            int total =0;
            int modOne=0;
            for(int i=0;i<occurrence.length;i++){
                if(occurrence[i]%2!=0){
                    total+=occurrence[i];
                    modOne++;
                }else{
                    total+=occurrence[i];
                }
                
            }
            if(modOne<=1){
               
                answer++;
            }
            occur =occurrence[node.val-1];
            occurrence[node.val-1]=occur-1;
            return;
        }
        // int [] occur2 = new int[9];
        // for(int i=0;i<occurrence.length;i++){
        //     occur2[i]=occurrence[i];
        // }
        int occur =occurrence[node.val-1]+1;
        occurrence[node.val-1]=occur;
        //1,2,3,4,5,6,7,8,9
        if(node.left!=null){
            dfs(node.left,occurrence);
        }
        
        if(node.right!=null){
            dfs(node.right,occurrence);
        }
        occur =occurrence[node.val-1]-1;
        occurrence[node.val-1]=occur;
    }
}