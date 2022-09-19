/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 45.90 %
    Runtime : 1 ms
    Memory Usage : 44.8 MB
    Testcase : 16 / 16 passed
    Ranking : 
        Your runtime beats 63.45 % of java submissions.
        Your memory usage beats 68.77 % of java submissions.
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
        ListNode fast, slow;
        fast = slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) break;



        }
        // ä¸é¢çä»£ç ç±»ä¼¼ hasCycle å½æ°
        if (fast == null || fast.next == null) {
            // fast éå°ç©ºæéè¯´ææ²¡æç¯
            return null;
        }

        // éæ°æåå¤´ç»ç¹
        slow = head;



        // å¿«æ¢æéåæ­¥åè¿ï¼ç¸äº¤ç¹å°±æ¯ç¯èµ·ç¹
        while (slow != fast) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}