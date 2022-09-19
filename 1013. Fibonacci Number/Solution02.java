/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 69.13 %
    Runtime : 9 ms
    Memory Usage : 41.8 MB
    Testcase : 31 / 31 passed
    Ranking : 
        Your runtime beats 37.79 % of java submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
   
    //Bottom up DFS
    public int fib(int n) {
        
        if(n<=1){
            return n;
        }
        int answer=fib(n-1)+fib(n-2);
        
        return answer;
        
    }
}