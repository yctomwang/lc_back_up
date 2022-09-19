/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 40.49 %
    Runtime : 8 ms
    Memory Usage : 44.6 MB
    Testcase : 114 / 114 passed
    Ranking : 
        Your runtime beats 5.85 % of java submissions.
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
    Map<Integer, Long> maxMap = new HashMap<>();
    Map<Integer, Long> minMap = new HashMap<>();
    
    public int widthOfBinaryTree(TreeNode root) {
        long answer=1;
        if(root==null) return 0;
        
        if(root.left!=null){
            dfs(root.left,1,false,1);
        }
        
        if(root.right!=null){
            dfs(root.right,1,true,1);
        }
        long minimum=0L;
        long maximum=0L;
        for(int level: maxMap.keySet()){
             minimum= minMap.get(level);
            //System.out.println(level);
             maximum = maxMap.get(level);
            //System.out.println(minimum+"____"+maximum);
            //if(maximum==4611686018427387904L&& minimum==4611686018427387904L) return 1;
            
            
            answer=Math.max(answer,maximum-minimum+1);
        }
        if(maximum==0L&&minimum==-1L)return 1;
        // for(int level:minMap.keySet()){
        //     System.out.println(minMap.get(level));
        // }
        
        return (int)answer;
        
    }
    //flag represents left or right true means right
    private void dfs(TreeNode node, long parentValue, boolean flag, int level){
        
        //exit to recursion
        if(node.left==null&&node.right==null){
            long currValue= parentValue*2;
            if(flag==false) currValue-=1;
            //long zero=0;
            long max= maxMap.getOrDefault(level,0L);
            long min = minMap.getOrDefault(level,Long.MAX_VALUE);
            max=Math.max(max,currValue);
            min=Math.min(min,currValue);
            maxMap.put(level,max);
            minMap.put(level,min);
            return;
        }
        long currValue= parentValue*2;
        if(flag==false) currValue-=1;
        
        long max= maxMap.getOrDefault(level,0L);
        long min = minMap.getOrDefault(level,Long.MAX_VALUE);
        max=Math.max(max,currValue);
        min=Math.min(min,currValue);
        maxMap.put(level,max);
        minMap.put(level,min);
        
        
        if(node.left!=null){
            dfs(node.left, currValue,false,level+1);
        }
        
        if(node.right!=null){
            dfs(node.right,currValue,true,level+1);
        }
        
        
        
    }
    
    
    
    
}