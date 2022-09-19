/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 59.78 %
    Runtime : 11 ms
    Memory Usage : 46.1 MB
    Testcase : 76 / 76 passed
    Ranking : 
        Your runtime beats 99.15 % of java submissions.
        Your memory usage beats 90.69 % of java submissions.
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
    public int[] nextLargerNodes(ListNode head) {
        int count=0;
        ListNode dummy = new ListNode(-1);
        List<Integer> answer = new ArrayList<>();
        dummy.next=head;
        ListNode start=dummy;
        while(start!=null&&start.next!=null){
            start=start.next;
            answer.add(start.val);
            count++;
            
        }
        Deque<Integer> stack = new ArrayDeque<>();
        int[] arr = new int[count];
        for(int i= count-1;i>=0;i--){
            int curr = answer.get(i);
            
            while(!stack.isEmpty()&&curr>=stack.peek()){
                stack.pop();
            }
            
            arr[i]= stack.isEmpty()?0:stack.peek();
            stack.push(curr);
        }
        return arr;
    }
}