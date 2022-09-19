/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 62.00 %
    Runtime : 15 ms
    Memory Usage : 43.7 MB
    Testcase : 57 / 57 passed
    Ranking : 
        Your runtime beats 73.76 % of java submissions.
        Your memory usage beats 17.44 % of java submissions.
}
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */



//Cast into a graph
//use BFS 10:18
//10:48
class Solution {
    public HashMap<TreeNode,TreeNode[]> map= new HashMap<>();
    
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
    List<Integer> answer = new ArrayList<>();
    
    TreeNode dummy= new TreeNode(-1);
    populateMap(root,dummy);
    if(k==0&&target!=null){
        answer.add(target.val);
        return answer;
    }
    Queue<TreeNode> q = new LinkedList<>();
    HashSet<TreeNode> visited = new HashSet<>();
    q.offer(target);
    visited.add(target);
    while(!q.isEmpty()){
        int qsize=q.size();
        
        for(int i=0;i<qsize;i++){
            TreeNode curr=q.poll();
            
            
            TreeNode[] neighbour =map.get(curr);
            for(int j=0;j<neighbour.length;j++){
                TreeNode neigh = neighbour[j];
                if(k>1){
                    if(neigh!=null&&!visited.contains(neigh)&&neigh.val!=-1){
                        q.offer(neigh);
                        visited.add(neigh);
                    }
                }else if(k==1){
                    if(neigh!=null&&neigh.val!=-1&&!visited.contains(neigh)){
                        answer.add(neigh.val);
                    }
                }
            }
            
            //add all of curr's neighbours 
            
        }
        k--;
    }
        
    return answer;
    
    }
    
    public TreeNode populateMap(TreeNode node, TreeNode parent){
        //exit condition
        if(node==null){return null;}
        
        TreeNode leftNode=populateMap(node.left,node);
        TreeNode rightNode=populateMap(node.right,node);
        TreeNode [] arr = new TreeNode[]{parent,leftNode,rightNode};
        map.put(node,arr);
        return node;
    }
}