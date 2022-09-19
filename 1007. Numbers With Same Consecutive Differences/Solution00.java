/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 56.85 %
    Runtime : 2 ms
    Memory Usage : 42.2 MB
    Testcase : 81 / 81 passed
    Ranking : 
        Your runtime beats 91.96 % of java submissions.
        Your memory usage beats 85.57 % of java submissions.
}
*/

class Solution {
    List<Integer> answer = new ArrayList<>();
    public int[] numsSameConsecDiff(int n, int k) {
        for(int i=1;i<10;i++){
            backTrack(n,k,i,i);
        }
        
        int[] answer2= new int[answer.size()];
        for(int i=0;i<answer.size();i++){
            answer2[i]=answer.get(i);
        }
        return answer2;
    }
    //current is the current value so far
    //last digit is our choice of last digit
    public void backTrack(int n, int k, int current,int lastdigit){
        //termination condition
        if(current>=Math.pow(10,n-1)&&current<Math.pow(10,n)){
            answer.add(current);
            return;
        }
        
        for(int i=0;i<10;i++){
            if(Math.abs(lastdigit-i)==k){
                int newCurr= current*10+i;
                backTrack(n,k,newCurr,i);
            }
        }
        
    }
    
}