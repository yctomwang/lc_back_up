/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 69.13 %
    Runtime : 1 ms
    Memory Usage : 40.9 MB
    Testcase : 31 / 31 passed
    Ranking : 
        Your runtime beats 47.04 % of java submissions.
        Your memory usage beats 40.68 % of java submissions.
}
*/

class Solution {
    private Queue<Integer> fibQueue= new ArrayDeque<>();
    private List<Integer> fibArr = new ArrayList<>();
    
    public int fib(int n) {
        
        fibArr.add(0);
        fibArr.add(1);
        fibQueue.offer(2);
        while(!fibQueue.isEmpty()){
            int curr=fibQueue.poll();
            int fibCurr=fibArr.get(curr-1)+fibArr.get(curr-2);
            fibArr.add(fibCurr);
            if(curr<=n){
                fibQueue.offer(curr+1);
            }
        }
        return fibArr.get(n);
    }
}