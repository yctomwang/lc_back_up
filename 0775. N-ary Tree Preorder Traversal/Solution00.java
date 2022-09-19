/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 76.35 %
    Runtime : 1 ms
    Memory Usage : 45.4 MB
    Testcase : 38 / 38 passed
    Ranking : 
        Your runtime beats 91.53 % of java submissions.
        Your memory usage beats 82.74 % of java submissions.
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
    public List<Integer> preorder(Node root) {
    List<Integer> answer= new ArrayList<>();
    DFS(root,answer);
    return answer;
    }
    public void DFS(Node node, List<Integer> answer){
        if(node==null){
            return;
        }
        answer.add(node.val);
        for(int i=0;i<node.children.size();i++){
            DFS(node.children.get(i),answer);
        }
       
    }
}