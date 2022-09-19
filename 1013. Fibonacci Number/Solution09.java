/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 69.13 %
    Runtime : 0 ms
    Memory Usage : 41.2 MB
    Testcase : 31 / 31 passed
    Ranking : 
        Your runtime beats 100.00 % of java submissions.
        Your memory usage beats 21.03 % of java submissions.
}
*/

class Solution {
    //from known to unknown
    public List<Integer> fib2 = new ArrayList<>();
    
    public int fib(int n) {
        fib2.add(0);
        fib2.add(1);
        for(int  i=2;i<=n;i++){
            int curr= fib2.get(i-1)+fib2.get(i-2);
            fib2.add(curr);
        }
        return fib2.get(n);
    }
}