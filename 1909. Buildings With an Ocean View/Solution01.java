/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 79.27 %
    Runtime : 18 ms
    Memory Usage : 87.9 MB
    Testcase : 77 / 77 passed
    Ranking : 
        Your runtime beats 47.60 % of java submissions.
        Your memory usage beats 24.70 % of java submissions.
}
*/

class Solution {
    public int[] findBuildings(int[] heights) {
       //O(n) time complexity
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int[] answer = new int[heights.length];
        for(int i = heights.length-1;i>=0;i--){
            if(stack.isEmpty()||heights[i]>stack.peekLast()){
                answer[i]=1;
            }
            if(stack.isEmpty()||heights[i]>stack.peekLast()){
                //System.out.println(heights[i]>stack.peekLast());
                stack.addLast(heights[i]);
            }
            //if(height[i]>tack.peekLas)
            
        }
        List<Integer> finalanswer= new ArrayList<>();
        for(int c=0;c<answer.length;c++){
            if(answer[c]==1) finalanswer.add(c);
        }
         int [] arr = new int [finalanswer.size()];
        for(int k=0;k<finalanswer.size();k++){
            arr[k]=finalanswer.get(k);
        }
    return arr;
        
    }
}