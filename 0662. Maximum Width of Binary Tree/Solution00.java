/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 40.49 %
    Runtime : 1 ms
    Memory Usage : 42.3 MB
    Testcase : 114 / 114 passed
    Ranking : 
        Your runtime beats 100.00 % of java submissions.
        Your memory usage beats 87.24 % of java submissions.
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
    private Integer maxWidth = 0;
    private HashMap<Integer, Integer> firstColIndexTable;

    protected void DFS(TreeNode node, Integer depth, Integer colIndex) {
        if (node == null)
            return;
        // initialize the value, for the first seen colIndex per level
        if (!firstColIndexTable.containsKey(depth)) {
            firstColIndexTable.put(depth, colIndex);
        }
        Integer firstColIndex = firstColIndexTable.get(depth);

        maxWidth = Math.max(this.maxWidth, colIndex - firstColIndex + 1);
        //System.out.println(colIndex);
        // Preorder DFS. Note: it is important to put the priority on the left child
        DFS(node.left, depth + 1, 2 * colIndex-1);
        DFS(node.right, depth + 1, 2 * colIndex);
    }

    public int widthOfBinaryTree(TreeNode root) {
        // table contains the first col_index for each level
        this.firstColIndexTable = new HashMap<Integer, Integer>();

        // start from depth = 0, and colIndex = 0
        DFS(root, 0, 1);

        return this.maxWidth;
    }
}