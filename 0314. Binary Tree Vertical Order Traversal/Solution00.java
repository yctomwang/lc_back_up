/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 51.92 %
    Runtime : 8 ms
    Memory Usage : 43.5 MB
    Testcase : 214 / 214 passed
    Ranking : 
        Your runtime beats 13.12 % of java submissions.
        Your memory usage beats 56.84 % of java submissions.
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
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        if(root==null){
            return answer;
        }
        //setup a map to store column vs tree node
        Map<Integer, ArrayList> map = new HashMap();
        Queue<Pair<TreeNode, Integer>> queue = new ArrayDeque();
        int column = 0;
        queue.offer(new Pair(root, column));
        
        while(!queue.isEmpty()){
            int qsize= queue.size();
            for(int i=0;i<qsize;i++){
                Pair ans=queue.poll();
                int col = (int)ans.getValue();
                
                TreeNode node= (TreeNode)ans.getKey();
               
               
                if(map.containsKey(col)){
                    map.get(col).add(node.val);
                    
                }else{
                    //if map does not contain, then we add it into the map
                    ArrayList<Integer> random = new ArrayList<Integer>();
                    random.add(node.val);
                    map.put(col,random);
                    
                }
            
            if(node.left!=null){
                //add to the queue
                
                queue.offer(new Pair(node.left,col-1));
                
            }
            if(node.right!=null){
                queue.offer(new Pair(node.right,col+1));
            }
            }
        }
        
        
    List<Integer> sortedKeys = new ArrayList<Integer>(map.keySet());
    Collections.sort(sortedKeys);
    for(int k : sortedKeys) {
        
        
      answer.add(map.get(k));
    }

        
        
        return answer;
        
    }
}