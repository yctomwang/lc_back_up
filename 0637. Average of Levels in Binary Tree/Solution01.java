/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 71.51 %
    Runtime : 9 ms
    Memory Usage : 47.4 MB
    Testcase : 66 / 66 passed
    Ranking : 
        Your runtime beats 7.76 % of java submissions.
        Your memory usage beats 69.57 % of java submissions.
}
*/


public class Solution {
    public List < Double > averageOfLevels(TreeNode root) {
        List < Double > res = new ArrayList < > ();
        Queue < TreeNode > queue = new LinkedList < > ();
        queue.add(root);
        while (!queue.isEmpty()) {
            long sum = 0, count = 0;
            Queue < TreeNode > temp = new LinkedList < > ();
            while (!queue.isEmpty()) {
                TreeNode n = queue.remove();
                sum += n.val;
                count++;
                if (n.left != null)
                    temp.add(n.left);
                if (n.right != null)
                    temp.add(n.right);
            }
            queue = temp;
            res.add(sum * 1.0 / count);
        }
        return res;
    }
}