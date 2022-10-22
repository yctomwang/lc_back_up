/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 50.21 %
    Runtime : 2 ms
    Memory Usage : 42.3 MB
    Testcase : 1919 / 1919 passed
    Ranking : 
        Your runtime beats 99.84 % of java submissions.
        Your memory usage beats 93.04 % of java submissions.
}
*/

class Solution {

    // åå«è®°å½è¿ä¸¤ä¸ªè¢«äº¤æ¢çèç¹
    TreeNode first = null, second = null;
    // å¤æ­ä¸­åºéåçæåºæ§
    TreeNode prev = new TreeNode(Integer.MIN_VALUE);


    public void recoverTree(TreeNode root) {
        inorderTraverse(root);

        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    void inorderTraverse(TreeNode root) {
        if (root == null) {
            return;
        }
        inorderTraverse(root.left);
        // ä¸­åºéåä»£ç ä½ç½®ï¼æ¾åºé£ä¸¤ä¸ªèç¹
        if (root.val < prev.val) {
            // root ä¸ç¬¦åæåºæ§
            if (first == null) {
                // ç¬¬ä¸ä¸ªéä½èç¹æ¯ prev
                first = prev;
            }
            // ç¬¬äºä¸ªéä½èç¹æ¯ root
            second = root;
        }
        prev = root;
        inorderTraverse(root.right);
    }
}