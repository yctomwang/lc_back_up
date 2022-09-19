/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 60.05 %
    Runtime : 0 ms
    Memory Usage : 40.9 MB
    Testcase : 55 / 55 passed
    Ranking : 
        Your memory usage beats 84.60 % of java submissions.
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
    public ListNode swapPairs(ListNode head) {
        //set dummy variable
        ListNode dummy= new ListNode(-1);
        dummy.next=head;
        ListNode fast=dummy;
        ListNode slow=dummy;
        ListNode fastfromprevious=dummy;
        //move fast and slow pointer to position
        if(slow.next!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //check boundery case
        if(slow==null||fast==null){
            return head; 
        }
      
       //main loop
        while(fast!=null&&slow!=null&&fast.next!=null){
            ListNode tempnext= fast.next;
           
            fast.next=slow;
            fastfromprevious.next=fast;
            slow.next=tempnext;
            ListNode tempslow = slow;
            
            
            slow=fast;
            fast=tempslow;
           
            
            slow=slow.next.next;
            fast=fast.next.next;
            fastfromprevious=fastfromprevious.next.next;
           
            
        }
        //check for cases with odd length
        if(fast!=null){
        ListNode tempnext= fast.next;
        fast.next=slow;
        fastfromprevious.next=fast;
        slow.next=tempnext;
        }
        
        
        
        return dummy.next;
        
    }
}