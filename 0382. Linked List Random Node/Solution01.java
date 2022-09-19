/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 59.39 %
    Runtime : 28 ms
    Memory Usage : 50.3 MB
    Testcase : 8 / 8 passed
    Ranking : 
        Your runtime beats 13.98 % of java submissions.
        Your memory usage beats 53.09 % of java submissions.
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
    private ArrayList<Integer> range = new ArrayList<>();

    public Solution(ListNode head) {
         while (head != null) {
            this.range.add(head.val);
            head = head.next;
        }
        
    }
    
    public int getRandom() {
         int pick = (int)(Math.random() * this.range.size());
        return this.range.get(pick);
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */