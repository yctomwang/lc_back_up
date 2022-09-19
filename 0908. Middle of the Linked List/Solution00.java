/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 73.63 %
    Runtime : 3 ms
    Memory Usage : 40.1 MB
    Testcase : 36 / 36 passed
    Ranking : 
        Your memory usage beats 87.58 % of java submissions.
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
    public ListNode middleNode(ListNode head) {
        ListNode dummy= new ListNode(-1);
        dummy.next=head;
        if(head.next!=null){
        ListNode slow=dummy.next;
        ListNode fast= dummy.next.next;
        int oddeven=0;
            
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            System.out.println(slow.val);
            oddeven+=1;
        }
            if(fast!=null){
                return slow.next;
            }
           else{
               return slow;
           }
            
        }
        
        
        return head;
        
    }
}