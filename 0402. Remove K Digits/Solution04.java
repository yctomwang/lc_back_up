/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 30.47 %
    Runtime : 18 ms
    Memory Usage : 47.7 MB
    Testcase : 43 / 43 passed
    Ranking : 
        Your runtime beats 88.31 % of java submissions.
        Your memory usage beats 68.22 % of java submissions.
}
*/

class Solution {
    public String removeKdigits(String num, int k) {
        //we want to maintain montic if possible 
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(int i=0;i<num.length();i++){
            while(!stack.isEmpty()&&k>0&&num.charAt(i)<stack.peekLast()){
                stack.removeLast();
                k--;
            }
            stack.addLast(num.charAt(i));
        }
        
        while(k>0){
            stack.removeLast();
            k--;
        }
        
        
      
        if(!stack.isEmpty()&&stack.peekFirst()=='0'){
            while(!stack.isEmpty()&&stack.peekFirst()=='0') stack.removeFirst();
        }
        
        if(stack.isEmpty()){
            return"0";
        }
        StringBuilder answer = new StringBuilder();
        for(char a:stack){
            answer.append(a);
        }
        
        //System.out.println(stack.toString());
       return answer.toString();
    }
}