/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 72.01 %
    Runtime : 0 ms
    Memory Usage : 42.7 MB
    Testcase : 28 / 28 passed
    Ranking : 
        Your memory usage beats 66.29 % of java submissions.
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
https://leetcode.com/problems/reverse-linked-list/solution/ * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head==null){
            return head;
        }
        ListNode startbefore=null;
        ListNode current= head;
        
        while(current.next!=null){
            
            ListNode nextnode=current.next;
            current.next= startbefore;
            startbefore=current;
            // System.out.println("current"+start.val);
            // System.out.println("nextnode"+nextnode.val);
            current=nextnode;
            
        }
        
        current.next= startbefore;
        
        
        return current ;
    }
}