/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 52.77 %
    Runtime : 1 ms
    Memory Usage : 55.6 MB
    Testcase : 39 / 39 passed
    Ranking : 
        Your runtime beats 99.73 % of java submissions.
        Your memory usage beats 28.65 % of java submissions.
}
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //store the head of B and head of A into a seperate parameter
        ListNode headBstart=headB;
        ListNode headAstart=headA;
        //loop through A and B untill one reaches the end
        while(headA!=null&&headB!=null){
            headA=headA.next;
            headB=headB.next;
        }
        //deal with A been the shorter one
        if(headA==null){
            //change A to start looping B
            headA=headBstart;
            while(headA!=null&&headB!=null){
                headA=headA.next;
                headB=headB.next;
            }
            //if A ranout and b havent, then no intersaction
            if(headA==null){
                return null;
            }
            //set B to point to A, then keep looping until A ==B
            else if(headB==null){
                headB=headAstart;
            while(headA!=null&&headB!=null){
                if(headA==headB){
                    return headA;
                }
                headA=headA.next;
                headB=headB.next;
            }
            //if after loop still nothing we return null
                return null;
                
            }
            
        }
        //deal with B been the shorter one
        else if(headB==null){
            headB=headAstart;
            
            while(headA!=null&&headB!=null){
                headA=headA.next;
                headB=headB.next;
            }
             if(headB==null){
                return null;
            }
            else if(headA==null){
                headA=headBstart;
            while(headA!=null&&headB!=null){
                if(headA==headB){
                    return headA;
                }
                headA=headA.next;
                headB=headB.next;
            }
                return null;
                
            }
        }
        return null;
    }
}