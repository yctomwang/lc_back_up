/*
Submission Detail:{
    Difficulty : Hard
    Acceptance Rate : 48.13 %
    Runtime : 90 ms
    Memory Usage : 48.9 MB
    Testcase : 133 / 133 passed
    Ranking : 
        Your runtime beats 21.04 % of java submissions.
        Your memory usage beats 5.89 % of java submissions.
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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> heap= new PriorityQueue<>((a,b)->a.val-b.val);
        //add everything into the list4
        //System.out.println(lists);
        for(int i = 0; i < lists.length; i++){
            if(lists[i]!=null){
                 heap.offer(lists[i]);
                
            }
           
            //System.out.println(lists.get(i).get(0));
            
        }
        ListNode dummy= new ListNode(-1);
        ListNode solution=dummy;
        
        while(!heap.isEmpty()){
            ListNode add= heap.poll();
            System.out.println(add.val);
            solution.next=add;
            solution=solution.next;
            if(add.next!=null){
                heap.offer(add.next);
            }
        }
        return dummy.next;
        
    }
}