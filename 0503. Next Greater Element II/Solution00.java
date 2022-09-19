/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 62.92 %
    Runtime : 11 ms
    Memory Usage : 55 MB
    Testcase : 223 / 223 passed
    Ranking : 
        Your runtime beats 92.57 % of java submissions.
        Your memory usage beats 45.90 % of java submissions.
}
*/

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] answer = new int[nums.length];
        //ArrayDeqeue 
        Deque<Integer> stack = new ArrayDeque<>();
        int n = nums.length;
        for(int i = 2*n-1;i>=0;i--){
            //into the stack we go right..
            //grab out the element
            int curr= nums[i%n];
            //
            while(!stack.isEmpty()&&curr>=stack.peek()){//make sure stack is valid
                stack.pop();
            }
            
            answer[i%n]=stack.isEmpty()? -1: stack.peek();
            stack.push(curr);
        }
        
        
        return answer;
        
    
    }
}