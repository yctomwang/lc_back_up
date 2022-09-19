/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 39.51 %
    Runtime : 2 ms
    Memory Usage : 42.5 MB
    Testcase : 1568 / 1568 passed
    Ranking : 
        Your runtime beats 99.44 % of java submissions.
        Your memory usage beats 88.97 % of java submissions.
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //requires us to add things, and bit manipulation
        ListNode dummy= new ListNode(-1);
        ListNode answer= dummy;
        ListNode first=l1;
        ListNode second=l2;
        int overflow=0;
        while(l1!=null&&l2!=null&&answer!=null){
            
            if(l1.val+l2.val+overflow<10){
               ListNode partialAnswer=new ListNode(l1.val+l2.val+overflow);
                answer.next= partialAnswer;
                overflow=0;
            }else{
                //deal with the larger case than 10
                int leftover= (l1.val+l2.val+overflow)%10;
                overflow=1;
                ListNode partialAnswer=new ListNode(leftover);
                answer.next= partialAnswer;
                //System.out.println("answer"+answer.val);
            }
            //System.out.println("answer"+answer.val);
            answer=answer.next;
            l1=l1.next;
            l2=l2.next;
        }
        if(l1==null){
            while(l2!=null&&answer!=null){
            if(l2.val+overflow<10){
               ListNode partialAnswer=new ListNode(l2.val+overflow);
                answer.next= partialAnswer;
                overflow=0;
            }else{
                //deal with the larger case than 10
                int leftover= (l2.val+overflow)%10;
                overflow=1;
                ListNode partialAnswer=new ListNode(leftover);
                answer.next= partialAnswer;
                //System.out.println("answer"+answer.val);
            }
                answer=answer.next;
            //l1=l1.next;
            l2=l2.next;
                
                
            }
            
            
        }
        else if(l2==null){
            while(l1!=null&&answer!=null){
                if(l1.val+overflow<10){
               ListNode partialAnswer=new ListNode(l1.val+overflow);
                answer.next= partialAnswer;
                overflow=0;
            }else{
                //deal with the larger case than 10
                int leftover= (l1.val+overflow)%10;
                overflow=1;
                ListNode partialAnswer=new ListNode(leftover);
                answer.next= partialAnswer;
                //System.out.println("answer"+answer.val);
            }
            answer=answer.next;
            l1=l1.next;
            //l2=l2.next;
                
            }
            
        }
        while(overflow!=0){
           ListNode partialAnswer=new ListNode(overflow);
            answer.next= partialAnswer;
            overflow=0;
        }
        return dummy.next;
        
    }
}