/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 52.77 %
    Runtime : 15 ms
    Memory Usage : 55 MB
    Testcase : 39 / 39 passed
    Ranking : 
        Your runtime beats 15.50 % of java submissions.
        Your memory usage beats 66.66 % of java submissions.
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
        //two pointer
        Set<ListNode> nodesInB = new HashSet<ListNode>();
        //loop through one linkedlist
        while(headB!=null){
            nodesInB.add(headB);
            headB=headB.next;
        }
        
        while(headA!=null){
            if(nodesInB.contains(headA)){
                return headA;
            }
            headA=headA.next;
    
        }
        return null;
    }
}