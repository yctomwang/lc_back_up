/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 69.13 %
    Runtime : 17 ms
    Memory Usage : 41.1 MB
    Testcase : 31 / 31 passed
    Ranking : 
        Your runtime beats 15.63 % of java submissions.
        Your memory usage beats 33.22 % of java submissions.
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