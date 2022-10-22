/*
Submission Detail:{
    Difficulty : Hard
    Acceptance Rate : 58.73 %
    Runtime : 6 ms
    Memory Usage : 50.7 MB
    Testcase : 322 / 322 passed
    Ranking : 
        Your runtime beats 13.40 % of java submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    public int trap(int[] height) {
        //trapping the rain water
        //we start at both ends for two pointers
        //
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int water=0;
        for(int i=0; i<height.length;i++){
            //maintain monotonic
            int minimum;
            while(!stack.isEmpty()&&height[stack.peekLast()]<height[i]){
                //stack.removeLast();
                minimum=height[stack.removeLast()];
                //peeklast() we can see whats to the left of it
                
                //if(height[stack.peekLast()]>minimum){
                    //103 then we have somehwere to store water right?
                if(!stack.isEmpty()){
                    int high=Math.min(height[stack.peekLast()],height[i])-minimum;
                water+=(i-stack.peekLast()-1)*high;
                }
                
                
            
            }
            stack.addLast(i);
        }
        
        return water;
    }
}