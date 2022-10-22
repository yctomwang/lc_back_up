/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 50.52 %
    Runtime : 48 ms
    Memory Usage : 43.7 MB
    Testcase : 22 / 22 passed
    Ranking : 
        Your runtime beats 38.21 % of java submissions.
        Your memory usage beats 14.42 % of java submissions.
}
*/

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    // a map to map old nodes with clones of them self
    Map<Node, Node> map = new HashMap<>();
    
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        Queue<Node> queue = new LinkedList<>();
        Set<Node> visited = new HashSet<>();
        
        queue.offer(node);
        visited.add(node);
        while(!queue.isEmpty()){
            Node curr = queue.poll();
            //populate the map
            map.put(curr, new Node(curr.val, new ArrayList<>()));
            
            for(Node neighbour: curr.neighbors){
                if(!visited.contains(neighbour)){
                    queue.offer(neighbour);
                    visited.add(neighbour);
                }
            }
        }
        
        
        //now we need to visit all nodes again
        Queue<Node> queue2 = new LinkedList<>();
        Set<Node> visited2 = new HashSet<>();
        queue2.offer(node);
        visited2.add(node);
        while(!queue2.isEmpty()){
            Node curr = queue2.poll();
            //populate the map
            Node copy = map.get(curr);
            
            
            for(Node neighbour: curr.neighbors){
                copy.neighbors.add(map.get(neighbour));
                if(!visited2.contains(neighbour)){
                    queue2.offer(neighbour);
                    visited2.add(neighbour);
                }
            }
        }
        
        
        return map.get(node);
        
    }
}