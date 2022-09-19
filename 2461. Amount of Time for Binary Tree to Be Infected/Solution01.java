/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 56.00 %
    Runtime : 231 ms
    Memory Usage : 171.3 MB
    Testcase : 79 / 79 passed
    Ranking : 
        Your runtime beats 40.16 % of java submissions.
        Your memory usage beats 35.85 % of java submissions.
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
    private Map<TreeNode,List<TreeNode>> map = new HashMap<>();
    private TreeNode startnode;
    public int amountOfTime(TreeNode root, int start) {
    //hashtable store child vs parent
        TreeNode dummy= new TreeNode(-1);
        createMapping(root,dummy);
        findInfect(root,start);
        //System.out.println(startnode.val);
        
        Queue<TreeNode> q= new ArrayDeque<>();
        HashSet<TreeNode> visited= new HashSet<>();
        
        q.offer(startnode);
        visited.add(startnode);
        int level =0;
        while(!q.isEmpty()){
            int qsize= q.size();
            //System.out.println(qsize);
            for(int i=0;i<qsize;i++){
                TreeNode curr= q.poll();
                for(TreeNode n:map.get(curr)){
                if(n.val>0&&!visited.contains(n)){
                    q.offer(n);
                    visited.add(n);
                }
                }
            }
            level++;
            
            
        }
        
        return level-1;
    }
    
    
    
    public void findInfect(TreeNode node, int start){
        if(node==null) return;
        if(node.val==start){
            startnode=node;
            return;
        }
        findInfect(node.left,start);
        findInfect(node.right,start);
    }
    //problem with dummy node
    public void createMapping(TreeNode node, TreeNode parent){
        //we must have parent aswell as child on current node
        List<TreeNode> list = new LinkedList<>();
        if(node==null){
            return;
        }
        
        if(node.left!=null){
            createMapping(node.left,node);
            list.add(node.left);
        }
        
        
        if(node.right!=null){
            createMapping(node.right,node);
            list.add(node.right);
                             
        }
        
        list.add(parent);
        map.put(node,list);
    }
}