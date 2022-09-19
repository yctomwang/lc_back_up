/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 46.68 %
    Runtime : 1 ms
    Memory Usage : 45.4 MB
    Testcase : 21 / 21 passed
    Ranking : 
        Your runtime beats 52.06 % of java submissions.
        Your memory usage beats 78.94 % of java submissions.
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
    //this is a pretty easy question with double poitner 
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(slow != null && fast != null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
            
        }
       
        
        return false;
        
    }
}