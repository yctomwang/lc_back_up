/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 65.51 %
    Runtime : 97 ms
    Memory Usage : 71.8 MB
    Testcase : 39 / 39 passed
    Ranking : 
        Your runtime beats 31.35 % of java submissions.
        Your memory usage beats 50.22 % of java submissions.
}
*/

class Solution {
    //online alg,æ¯è¿ä¸ä¸ªï¼å é¡¶é½æ¯å½åçæå°
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        //does it contain duplicates?
        //nth largest elemt
        
        //4,2,3,3,1,2,2 2nd
        //6,5,5,5,5,3,3,3,3,7
        //åä¸ä¸ªæ»çªä¸æ ·ï¼æä»¬åªçç®åä¸ºæ­¢ï¼ç¢°å°çæå¤§çKä¸ªåç´ 
        for(int i=0;i<nums.length;i++){
            
                heap.add(nums[i]);
            
            if(heap.size()>k){
                heap.poll();
            }
        }
        
        return heap.peek();
    }
}