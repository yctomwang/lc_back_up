/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 77.26 %
    Runtime : 24 ms
    Memory Usage : 43.1 MB
    Testcase : 31 / 31 passed
    Ranking : 
        Your runtime beats 92.32 % of java submissions.
        Your memory usage beats 95.73 % of java submissions.
}
*/

/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/

class Solution {
    Set<Node> setOfNode = new HashSet<>();
    Node solution;
    public Node lowestCommonAncestor(Node p, Node q) {
        
        dfs(p,q);
        
        dfs2(q);
        
        return solution;
    }
    
    private void dfs2(Node node){
        if(node==null){
           
            return;
        }
       
        if(setOfNode.contains(node)){
            if(solution==null)solution = node;
        }
        
        else if(!setOfNode.contains(node)){
            
            setOfNode.add(node);
            dfs2(node.parent);
            
        }
//         else if(setOfNode.contains(target)){
//              solution = target;
            
//         }
    }
    private void dfs(Node node, Node target){
        if(node==null){
            
            return;
        }
        //System.out.println(node.val);
        
        if(!setOfNode.contains(node)){
            //System.out.println("i");
            setOfNode.add(node);
            dfs(node.parent,target);
            
        }
        else if(setOfNode.contains(target)){
             solution = target;
            
        }
    }
    
    
}