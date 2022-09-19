/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 69.13 %
    Runtime : 32 ms
    Memory Usage : 41.2 MB
    Testcase : 31 / 31 passed
    Ranking : 
        Your memory usage beats 21.03 % of java submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    private List<Integer> numArr= new ArrayList<>(Arrays.asList(0,1));
    
    public int fib(int n) {
        //out of recursion
        if(n<=1){
            return numArr.get(n);
        }
        int answer=fib(n-1)+fib(n-2);
        
        return answer;
        
    }
}