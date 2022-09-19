/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 50.44 %
    Runtime : 2 ms
    Memory Usage : 54.4 MB
    Testcase : 12 / 12 passed
    Ranking : 
        Your runtime beats 78.70 % of java submissions.
        Your memory usage beats 33.61 % of java submissions.
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
    public void reorderList(ListNode head) {
        //find the middle
        if (head == null) return;
        ListNode slow = head, fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast==null){
            //then we have i guess even number of nodes
            ListNode prev = null;
            ListNode curr = slow;
            while (curr != null) {
                ListNode nextTemp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextTemp;
            }
            ListNode first=head;
            ListNode second=prev;
            while(first!=prev&&second.next!=null){
                //grab the 2
                ListNode tmp = first.next;
                //link 1 with 4
                first.next = second;
                //move first ahead
                first = tmp;
                //grab the 3
                tmp = second.next;
                //link 4with 2
                second.next = first;
                //move 4 ahead;
                second = tmp;
            }
        }
        
        else if(fast.next==null){
             //then we have i guess even number of nodes
            ListNode prev = null;
            ListNode curr = slow;
            while (curr != null) {
                ListNode nextTemp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextTemp;
            }
            ListNode first=head;
            ListNode second=prev;
            while(first!=prev&&second.next!=null){
                //grab the 2
                ListNode tmp = first.next;
                //link 1 with 4
                first.next = second;
                //move first ahead
                first = tmp;
                //grab the 3
                tmp = second.next;
                //link 4with 2
                second.next = first;
                //move 4 ahead;
                second = tmp;
            }
        }
        //reverse the second part
        
    }
}