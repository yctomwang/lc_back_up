/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 44.12 %
    Runtime : 5 ms
    Memory Usage : 42.2 MB
    Testcase : 116 / 116 passed
    Ranking : 
        Your runtime beats 7.29 % of java submissions.
        Your memory usage beats 99.06 % of java submissions.
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
    boolean leftFlag=false;
    boolean rightFlag=false;
    List<Integer> answer = new LinkedList<>();
    HashSet<TreeNode> duplicate = new HashSet<>();
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        //List<Integer> answer = new LinkedList<>();
        //HashSet<TreeNode> duplicate = new HashSet<>();
        //print left boundery
        
        findLeaf(root);
        if(root.left!=null){
            findLeft(root.left,0);
        }
        if(root.right!=null){
            findRight(root.right);
        }
        if(!duplicate.contains(root)){
            answer.add(0,root.val);
        }
        
        //print()
        
        return answer;
    }
    
    
    public void findLeaf(TreeNode node){
        if(node.left==null&&node.right==null){
            answer.add(node.val);
            duplicate.add(node);
            return;
        }
        
        if(node.left!=null){
            findLeaf(node.left);
        }
        if(node.right!=null){
            findLeaf(node.right);
        }
    }
    
    public void findLeft(TreeNode node, int index){
        if(node.left==null&&node.right==null){
            leftFlag=true;
            return;
        }
        if(leftFlag!=true){
            if(!duplicate.contains(node)){
                //System.out.println(node.val);
                answer.add(index,node.val);
                //System.out.println(answer);
                duplicate.add(node);
            }
            
        }
        
        if(node.left!=null){
            findLeft(node.left,index+1);
        }
        if(node.right!=null){
            findLeft(node.right,index+1);
        }
        
        
        
    }
    
    public boolean findRight(TreeNode node){
        if(node.left==null&&node.right==null){
            if(rightFlag==false){
                rightFlag=true;
                return true;
            }else{
                return false;
            }
        }
       
        boolean levelleft=false;
        boolean levelright=false;
        
        if(node.right!=null){
            levelright=findRight(node.right);
        }
        if(node.left!=null){
            levelleft=findRight(node.left);
        }
        
        if(!duplicate.contains(node)&&(levelleft==true||levelright==true)){
            answer.add(node.val);
            duplicate.add(node);
        }
        return levelleft||levelright;
        
        
    }
}