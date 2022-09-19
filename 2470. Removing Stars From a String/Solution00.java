/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 62.10 %
    Runtime : 159 ms
    Memory Usage : 43.4 MB
    Testcase : 65 / 65 passed
    Ranking : 
        Your runtime beats 57.23 % of java submissions.
        Your memory usage beats 95.29 % of java submissions.
}
*/

class Solution {
    public String removeStars(String s) {
    Stack<Character> stack = new Stack<>();
    for(int i=0;i<s.length();i++){
        char curr= s.charAt(i);
        if(curr!='*'){
            stack.push(curr);
        }
        else{
          stack.pop();
        }
        
    }
    StringBuilder s1 = new StringBuilder();
    for(char s2:stack){
        s1.append(s2);
    }
    //System.out.println(stack);
    return s1.toString();
    }
}