/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 81.88 %
    Runtime : 8 ms
    Memory Usage : 114.9 MB
    Testcase : 46 / 46 passed
    Ranking : 
        Your runtime beats 73.11 % of java submissions.
        Your memory usage beats 50.33 % of java submissions.
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
    public int pairSum(ListNode head) {
        //find the middle
        //reverse half of it
        int answer=0;
        
        ListNode dummy= new ListNode(-1);
        //find the middle of a linkedllist
        dummy.next=head;
        ListNode slow=dummy;
        ListNode fast=dummy;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        ListNode otherHalf= slow.next;
        //reverse
        
        ListNode prev = dummy;
        ListNode curr = head;
        while(curr!=otherHalf){
            ListNode next= curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        //System.out.println(prev.next.val);
        while(prev!=dummy&&otherHalf!=null){
            answer=Math.max(answer,prev.val+otherHalf.val);
            
            prev=prev.next;
            otherHalf=otherHalf.next;
        }
        //System.out.println(slow.val);
        return answer;
    }
}