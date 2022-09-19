/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 57.23 %
    Runtime : 4 ms
    Memory Usage : 41.9 MB
    Testcase : 34 / 34 passed
    Ranking : 
        Your runtime beats 40.76 % of java submissions.
        Your memory usage beats 72.26 % of java submissions.
}
*/

class Solution {
    public String decodeString(String s) {
        Stack<Character> stack= new Stack<>();
        char end =']';
        
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)!=end){
               stack.push(s.charAt(i));
                
            }
            else{
                List<Character> decodedString = new ArrayList<>();
                while(!stack.isEmpty()&&stack.peek()!='['){
                    decodedString.add(0,stack.pop());
                }
                
                stack.pop();//pop out the [
                StringBuilder numString = new StringBuilder();
                while(!stack.isEmpty()&&Character.isDigit(stack.peek())){
                    numString.append(stack.pop());
                }
                //fetch the numer
                numString.reverse();
                int number = Integer.parseInt(numString.toString());
                for(int c=0;c<number;c++){
                    for(int j=0; j<decodedString.size();j++){
                        stack.push(decodedString.get(j));
                    }
                }
            }
            
            
        }
        StringBuilder answer1= new StringBuilder();
        for(char a: stack){
            answer1.append(a);
        }
        // System.out.println(stack.toString());
        
        
        return answer1.toString();
    }
}