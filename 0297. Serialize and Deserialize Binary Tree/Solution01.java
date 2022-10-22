/*
Submission Detail:{
    Difficulty : Hard
    Acceptance Rate : 54.91 %
    Runtime : 9 ms
    Memory Usage : 43.7 MB
    Testcase : 52 / 52 passed
    Ranking : 
        Your runtime beats 94.99 % of java submissions.
        Your memory usage beats 97.46 % of java submissions.
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
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        treeToString(root,sb);
        System.out.println(sb.toString());
        return sb.toString();
    }
    //1 2 $ $ 3 4 $ $ 5 $ $
    private void treeToString(TreeNode root, StringBuilder sb){
        if(root==null){
            sb.append("$");
            sb.append(",");
            return;
        }
        sb.append(root.val);
        sb.append(",");
        treeToString(root.left,sb);
        treeToString(root.right,sb);
    }
    
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> q = new LinkedList<>(Arrays.asList(data.split(",")));
        return helper(q);
    }
    
    private TreeNode helper(Queue<String> q){
        String s = q.poll();
        if(s.equals("$")) return null;
        TreeNode root = new TreeNode(Integer.valueOf(s));
        root.left= helper(q);
        root.right= helper(q);
        return root;
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));