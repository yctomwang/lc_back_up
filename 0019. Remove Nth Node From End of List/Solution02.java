/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 39.21 %
    Runtime : 1 ms
    Memory Usage : 42.5 MB
    Testcase : 208 / 208 passed
    Ranking : 
        Your memory usage beats 27.71 % of java submissions.
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        ListNode slow=dummy;
        ListNode fast= dummy;
        //deal with the fast pointer
        for(int i=0; i<n+1; i++){
            fast=fast.next;
            
        }
        
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        
        ListNode temp= slow.next;
        slow.next=temp.next;
        
        return dummy.next;
        
    }
}