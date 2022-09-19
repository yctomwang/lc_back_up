/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 72.01 %
    Runtime : 38 ms
    Memory Usage : 44.1 MB
    Testcase : 28 / 28 passed
    Ranking : 
        Your runtime beats 00.00 % of submissions.
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
            System.out.println("current"+start.val);
            // System.out.println("nextnode"+nextnode.val);
            start=nextnode;
            
        }
        return startbefore;
    }
}