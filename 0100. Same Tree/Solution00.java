/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 56.19 %
    Runtime : 1 ms
    Memory Usage : 41.6 MB
    Testcase : 60 / 60 passed
    Ranking : 
        Your memory usage beats 50.26 % of java submissions.
        Your memory usage beats 00.00 % of submissions.
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
import java.io.*;
import java.util.*;
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
    Deque<TreeNode> dq=new LinkedList<>();
        dq.offer(p);
        dq.offer(q);
        while(!dq.isEmpty()){
            p=dq.poll();
            q=dq.poll();
            if(p==null && q==null)
                continue;
            if(q==null || p==null)
                return false;
            if(p.val!=q.val)
                return false;
            dq.offer(p.left);
            dq.offer(q.left);
            dq.offer(p.right);
            dq.offer(q.right);
        }
        return true;
    }
}
