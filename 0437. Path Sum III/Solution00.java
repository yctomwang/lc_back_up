/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 49.09 %
    Runtime : 47 ms
    Memory Usage : 57.8 MB
    Testcase : 128 / 128 passed
    Ranking : 
        Your runtime beats 12.32 % of java submissions.
        Your memory usage beats 5.72 % of java submissions.
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
    //List<Integer> gloablList = new ArrayList<>();
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null){
            return 0;
        }
        // if(root.left==null&&root.right==null){
        // if(root.val==targetSum){
        //         answer++;
        // }
        // }
        backTrack(root,new ArrayList<>(),targetSum);
        return answer;
    }
    
    public void backTrack(TreeNode node, List<Integer> parentList, int targetSum ){
        //termination
        if(node.left==null&&node.right==null){
            if(node.val==targetSum){answer++;}
            int levelTarget = targetSum-node.val;
            long tempTarget =0;
            for(int i=0;i<parentList.size();i++){
                tempTarget+=parentList.get(i);
                if(tempTarget==levelTarget){
                    //System.out.println(node.val);
                    answer++;
                }
            }
            return;
        }
        if(node.val==targetSum){answer++;}
        int levelTarget = targetSum-node.val;
        long tempTarget =0;
        //System.out.println(parentList);
        for(int i=0;i<parentList.size();i++){
            tempTarget+=parentList.get(i);
            if(tempTarget==levelTarget){
                //System.out.println(node.val);
                    answer++;
            }
        }
        List<Integer> parentList2 = new ArrayList<>(parentList);
        parentList2.add(0,node.val);
        if(node.left!=null){
            backTrack(node.left,parentList2,targetSum);
        }
        
        if(node.right!=null){
            backTrack(node.right,parentList2,targetSum);
        }
        return;
        
        
        
    }
}