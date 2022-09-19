/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 67.34 %
    Runtime : 49 ms
    Memory Usage : 134.1 MB
    Testcase : 47 / 47 passed
    Ranking : 
        Your runtime beats 79.39 % of java submissions.
        Your memory usage beats 19.32 % of java submissions.
}
*/

class Solution {
    //translate into human words, find the next greater element's distance
    public int[] dailyTemperatures(int[] temp) {
        //for loop to loop through
        int[] answer = new int[temp.length];
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(int i=temp.length-1;i>=0;i-- ){
            //maintain montic stack
            //update the answer array
            while(!stack.isEmpty()&&temp[i]>=temp[stack.peek()]){
                stack.pop();
            }
            
            answer[i]=stack.isEmpty()?0:stack.peek()-i;
            stack.push(i);
        }
        
        
        
        return answer;
    }
}