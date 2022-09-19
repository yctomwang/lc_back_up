/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 56.85 %
    Runtime : 4 ms
    Memory Usage : 42.9 MB
    Testcase : 81 / 81 passed
    Ranking : 
        Your runtime beats 66.43 % of java submissions.
        Your memory usage beats 50.59 % of java submissions.
}
*/

class Solution {
    List<Integer> answer = new ArrayList<>();
    public int[] numsSameConsecDiff(int n, int k) {
        //backTracking
        //0-9
        //upto n digits
    
    //return answer.toArray();
        for(int i=1;i<10;i++){
            backTrack(n,k,i,i);
        }
        //backTrack(n,k,1,1);
        //System.out.println(answer);
        int[] answer2= new int[answer.size()];
        for(int i=0;i<answer.size();i++){
            answer2[i]=answer.get(i);
        }
        return answer2;
        
    }
    
    
    public void backTrack(int n, int k, int current,int lastdigit){
        //termination condition
        if(current>=Math.pow(10,n-1)&&current<Math.pow(10,n)){
            answer.add(current);
            return;
        }
        
        for(int i=0;i<10;i++){
            if(Math.abs(lastdigit-i)==k){
                //System.out.println(current);
                int newCurr= current*10+i;
                backTrack(n,k,newCurr,i);
            }
        }
        
        
        
    }
    
}