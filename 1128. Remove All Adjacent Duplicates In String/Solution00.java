/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 70.58 %
    Runtime : 43 ms
    Memory Usage : 53.5 MB
    Testcase : 106 / 106 passed
    Ranking : 
        Your runtime beats 67.05 % of java submissions.
        Your memory usage beats 56.85 % of java submissions.
}
*/

class Solution {
    public String removeDuplicates(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        
        for(int i=0;i<s.length();i++){
            int flag=1;
            while(!stack.isEmpty()&&s.charAt(i)==stack.peekLast()){
                stack.removeLast();
                flag=0;
            }
            if(flag!=0)stack.addLast(s.charAt(i));
        }
         StringBuilder s1= new StringBuilder();
        for(char a: stack){
            s1.append(a);
        }
        
        return s1.toString();
    }
}