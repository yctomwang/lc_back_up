/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 61.56 %
    Runtime : 1 ms
    Memory Usage : 43.7 MB
    Testcase : 208 / 208 passed
    Ranking : 
        Your runtime beats 81.07 % of java submissions.
        Your memory usage beats 7.86 % of java submissions.
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode p = new ListNode(-1);
        ListNode dummy= p;
        
        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                p.next=list1;
                list1=list1.next;
                
            }
            else{
                p.next=list2;
                list2=list2.next;
            }
            p=p.next;
            
        }
        
        if(list2==null&&list1!=null){
            p.next=list1;
            list1=list1.next;
            p=p.next;
            
        }
        else if(list1==null&&list2!=null){
            p.next=list2;
            list2=list2.next;
            p=p.next;
            
        }
        return dummy.next;
        
    }
}