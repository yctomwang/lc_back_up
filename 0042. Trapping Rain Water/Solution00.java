/*
Submission Detail:{
    Difficulty : Hard
    Acceptance Rate : 58.34 %
    Runtime : 5 ms
    Memory Usage : 50.7 MB
    Testcase : 322 / 322 passed
    Ranking : 
        Your runtime beats 14.93 % of java submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    public int trap(int[] height) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int water=0;
        for(int i=0; i<height.length;i++){
            //maintain monotonic
            int minimum;
            while(!stack.isEmpty()&&height[stack.peekLast()]<height[i]){
                //æ¹åºçé«åº¦
                minimum=height[stack.removeLast()];
               
                //popææ¹åºä¹åï¼peekå¯ä»¥çè§æ¹è¾¹ä¸çelementçé«åº¦
                //å¦æè¿ä¸ªelementåiç´æ¥æå°çé£ä¸ª-æ¹åºé«åº¦ç­äº0æå³æ²¡æ°´
                //334
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