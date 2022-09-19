/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 45.90 %
    Runtime : 8 ms
    Memory Usage : 45.8 MB
    Testcase : 16 / 16 passed
    Ranking : 
        Your runtime beats 12.64 % of java submissions.
        Your memory usage beats 21.14 % of java submissions.
}
*/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> visited = new HashSet<ListNode>();

        ListNode node = head;
        while (node != null) {
            if (visited.contains(node)) {
                return node;
            }
            visited.add(node);
            node = node.next;
        }

        return null;
    }
}