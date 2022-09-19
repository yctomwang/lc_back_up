/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 69.13 %
    Runtime : 1 ms
    Memory Usage : 41 MB
    Testcase : 31 / 31 passed
    Ranking : 
        Your runtime beats 47.04 % of java submissions.
        Your memory usage beats 40.68 % of java submissions.
}
*/

class Solution {
    private List<Integer> numArr= new ArrayList<>(Arrays.asList(0,1));
    //Bottom up DFS
    public int fib(int n) {
        if(n<2){
            return numArr.get(n);
        }
        dfs(2,n);
       return numArr.get(n);
    }
    
    public void dfs(int i, int n){
        if(i>n){
            return;
        }
        int curr= numArr.get(i-1)+numArr.get(i-2);
        numArr.add(curr);
        dfs(i+1,n);
       
    }
}