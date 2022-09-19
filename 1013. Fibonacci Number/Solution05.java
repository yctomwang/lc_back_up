/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 69.13 %
    Runtime : 28 ms
    Memory Usage : 41.2 MB
    Testcase : 31 / 31 passed
    Ranking : 
        Your runtime beats 5.27 % of java submissions.
        Your memory usage beats 26.69 % of java submissions.
}
*/

class Solution {
    private List<Integer> numArr= new ArrayList<>(Arrays.asList(0,1));
    //Bottom up DFS
    public int fib(int n) {
        
        if(n<=1){
            return numArr.get(n);
        }
        int answer=fib(n-1)+fib(n-2);
        
        return answer;
        
    }
}