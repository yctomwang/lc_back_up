/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 72.01 %
    Runtime : 0 ms
    Memory Usage : 42.6 MB
    Testcase : 28 / 28 passed
    Ranking : 
        Your memory usage beats 77.08 % of java submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode start= head;
        ListNode startbefore=null;
        while(start!=null){
            
            ListNode nextnode=start.next;
            start.next= startbefore;
            startbefore=start;
            // System.out.println("current"+start.val);
            // System.out.println("nextnode"+nextnode.val);
            start=nextnode;
            
        }
        return startbefore;
    }
}