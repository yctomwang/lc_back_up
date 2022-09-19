/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 52.77 %
    Runtime : 1 ms
    Memory Usage : 45.6 MB
    Testcase : 39 / 39 passed
    Ranking : 
        Your runtime beats 99.73 % of java submissions.
        Your memory usage beats 87.57 % of java submissions.
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
        //brute would be using a set to store what we have seen hastable appraoch
        ListNode headBstart=headB;
        ListNode headAstart=headA;
        while(headA!=null&&headB!=null){
            headA=headA.next;
            headB=headB.next;
        }
        
        if(headA==null){
            headA=headBstart;
            while(headA!=null&&headB!=null){
                headA=headA.next;
                headB=headB.next;
            }
            if(headA==null){
                return null;
            }
            else if(headB==null){
                headB=headAstart;
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