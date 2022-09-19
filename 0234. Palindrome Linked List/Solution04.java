/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 49.14 %
    Runtime : 4 ms
    Memory Usage : 98.4 MB
    Testcase : 86 / 86 passed
    Ranking : 
        Your runtime beats 97.60 % of java submissions.
        Your memory usage beats 44.30 % of java submissions.
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
    public boolean isPalindrome(ListNode head) {
        //find the middle first
        //create a dummy node
        if(head.next==null){return true;}
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        int flag=0;
        
        ListNode fast=dummy;
        ListNode slow=dummy;
        while(!(fast==null||fast.next==null)){
            fast=fast.next.next;
            slow=slow.next;
            //System.out.println(slow.val);
        }
        if(fast==null){
            flag=1;
        }
        
        ListNode secondhalf = slow.next;
        ListNode startbefore=null;
        ListNode current= head;
        
        while(!current.next.equals(slow.next)){
            
            ListNode nextnode=current.next;
            current.next= startbefore;
            startbefore=current;
            // System.out.println("current"+start.val);
            // System.out.println("nextnode"+nextnode.val);
            current=nextnode;
            
        }
        current.next=startbefore;
        //System.out.println("curr"+current.val);
        //System.out.println(slow.next.val);
        //System.out.println("curr"+secondhalf.val);
        
        if(flag==1){
            current=current.next;
            
        }
        while(current!=null||secondhalf!=null){
                if(current.val!=secondhalf.val){
                    return false;
                }
            current=current.next;
            secondhalf=secondhalf.next;
            
                
            }
        
        return true;
    }
}