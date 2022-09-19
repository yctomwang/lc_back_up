/*
Submission Detail:{
    Difficulty : Hard
    Acceptance Rate : 53.02 %
    Runtime : 1 ms
    Memory Usage : 45.8 MB
    Testcase : 62 / 62 passed
    Ranking : 
        Your runtime beats 63.80 % of java submissions.
        Your memory usage beats 38.34 % of java submissions.
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
    public ListNode global;
    public ListNode global2;
    public boolean flag=true;
    public ListNode reverseKGroup(ListNode head, int k) {
        
        if(k==1){
            return head;
        }
        
        ListNode dummy = new ListNode(-1);
        global=head;
        global2=dummy;
        ListNode recurr= new ListNode(-20);
    
        while(flag==true){
            ListNode recurr2 = recursion(global,k,1,global2);
            if(recurr.val==-20){
                recurr=recurr2;
            }
            
            global2.next=global;
           
        }
        return recurr;
    }
    public ListNode recursion(ListNode node, int k, int current, ListNode previous){
        //termination condition
        //reach the end or reached k groups lol
        if(current%k==0||node==null){
            if(node!=null){
                global=node.next;
                global2.next=node;
                node.next=previous;
            }else{ 
                flag=false;
            }
            return node;
        }
        ListNode recurr = recursion(node.next, k, current+1, node);
        
        if(previous.val==-1){
            node.next=null;
        }else if(recurr!=null){
            node.next=previous;
        }
        if(current%k==1&&recurr!=null){
            global2=node;
        }
        if(recurr==null&&current==1){
            global2.next=node;
        }
        return recurr;
        
    }
}