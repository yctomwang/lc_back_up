/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 71.18 %
    Runtime : 4 ms
    Memory Usage : 44.3 MB
    Testcase : 15 / 15 passed
    Ranking : 
        Your runtime beats 84.28 % of java submissions.
        Your memory usage beats 52.32 % of java submissions.
}
*/

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        //create a hashmap to store all of elements in nums1 and biggest element
        Map<Integer,Integer> answerMap = new HashMap<>();
        //stores up to that element the biggest that ever appears
        Deque<Integer> stack = new ArrayDeque<>();
        
        for(int i=nums2.length-1;i>=0;i--){
            int curr = nums2[i];
            if(i==nums2.length){
                stack.push(curr);
                answerMap.put(curr,-1);
            }
            
            while(!stack.isEmpty()&&curr>stack.peek()){
                stack.pop();
            }
            
            if(!stack.isEmpty()){
                answerMap.put(curr,stack.peek());
            
            }else{
                answerMap.put(curr,-1);
            }
            stack.push(curr);
            
        }
        int[] answer= new int[nums1.length];
        for(int j=0;j<nums1.length;j++){
            answer[j]=answerMap.get(nums1[j]);
        }
        return answer;
    }
}