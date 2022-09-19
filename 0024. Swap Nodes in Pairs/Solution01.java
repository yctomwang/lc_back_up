/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 60.05 %
    Runtime : 0 ms
    Memory Usage : 41.6 MB
    Testcase : 55 / 55 passed
    Ranking : 
        Your memory usage beats 68.44 % of java submissions.
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
        ListNode dummy= new ListNode(-1);
        dummy.next=head;
        ListNode fast=dummy;
        ListNode slow=dummy;
        ListNode fastfromprevious=dummy;
        
        if(slow.next!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        if(slow==null||fast==null){
            return head; 
        }
        // System.out.println(fast.val);
        // System.out.println(slow.val);
       
        while(fast!=null&&slow!=null&&fast.next!=null){
            ListNode tempnext= fast.next;
            //System.out.println("tempnext"+tempnext.val);
            fast.next=slow;
            fastfromprevious.next=fast;
            slow.next=tempnext;
            ListNode tempslow = slow;
            // System.out.println("fastbefore"+fast.val);
            // System.out.println("slowbefore"+slow.val);
            
            slow=fast;
            fast=tempslow;
            // System.out.println("fastafter"+fast.val);
            // System.out.println("slowafter"+slow.val);
            // System.out.println("fastafternext"+fast.next.val);
            
            
            slow=slow.next.next;
            fast=fast.next.next;
            fastfromprevious=fastfromprevious.next.next;
            // System.out.println("fastafterchange"+fast.val);
            // System.out.println("slowafterchange"+slow.val);
            
        }
        if(fast!=null){
            ListNode tempnext= fast.next;
        //System.out.println("tempnext"+tempnext.val);
        fast.next=slow;
        fastfromprevious.next=fast;
        slow.next=tempnext;
        }
        
        
        
        return dummy.next;
        
    }
}