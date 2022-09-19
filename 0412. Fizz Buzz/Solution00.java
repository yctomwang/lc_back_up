/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 68.29 %
    Runtime : 1 ms
    Memory Usage : 48.4 MB
    Testcase : 8 / 8 passed
    Ranking : 
        Your runtime beats 99.99 % of java submissions.
        Your memory usage beats 50.09 % of java submissions.
}
*/

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        
        for(int i=1; i<n+1;i++){
            if(i%3==0&&i%5==0){
                String s1="FizzBuzz";
                answer.add(s1);
            }
            else if(i%3==0){
                 String s1="Fizz";
                answer.add(s1);
            }
            else if(i%5==0){
                 String s1="Buzz";
                answer.add(s1);
            }else{
                String s1= Integer.toString(i);
                answer.add(s1);
            }
        }
        
        return answer;
    }
}