/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 68.29 %
    Runtime : 5 ms
    Memory Usage : 49 MB
    Testcase : 8 / 8 passed
    Ranking : 
        Your runtime beats 12.01 % of java submissions.
        Your memory usage beats 9.06 % of java submissions.
}
*/

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        //String ans="";
        
        
        for(int i=1; i<n+1;i++){
            String ans ="";
            if(i%3==0){
                ans+="Fizz";
            }
            if(i%5==0){
                ans+="Buzz";
                answer.add(ans);
                continue;
            }
            if(ans.length()==4){
                answer.add(ans);
                continue;
            }
            ans+= Integer.toString(i);
            answer.add(ans);
        }
        return answer;
    }
}