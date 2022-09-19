/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 70.51 %
    Runtime : 2 ms
    Memory Usage : 43.1 MB
    Testcase : 38 / 38 passed
    Ranking : 
        Your runtime beats 96.64 % of java submissions.
        Your memory usage beats 95.15 % of java submissions.
}
*/

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        
        if(root==null){
            return ans;
        }
        Queue<Node> q = new LinkedList<>();  
        q.offer(root);
        while(!q.isEmpty()){
            int qsize= q.size();
            List<Integer> currLevel = new ArrayList<>();
            for(int i=0;i<qsize;i++){
                Node curr = q.poll();
                currLevel.add(curr.val);
                for(int j=0;j<curr.children.size();j++){
                    if(curr.children.get(j)!=null){
                        q.offer(curr.children.get(j));
                        
                    }
                    
                }
            }
            ans.add(currLevel);
        }
        
        return ans;
    }
}