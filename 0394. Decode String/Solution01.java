/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 57.23 %
    Runtime : 3 ms
    Memory Usage : 42 MB
    Testcase : 34 / 34 passed
    Ranking : 
        Your runtime beats 48.14 % of java submissions.
        Your memory usage beats 58.54 % of java submissions.
}
*/

class Solution {
    public String decodeString(String s) {
        ArrayDeque<Character> stack= new ArrayDeque<>();
        char end =']';
        
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)!=end){
               stack.addLast(s.charAt(i));
                
            }
            else{
                List<Character> decodedString = new ArrayList<>();
                while(!stack.isEmpty()&&stack.peekLast()!='['){
                    decodedString.add(0,stack.removeLast());
                }
                
                stack.removeLast();//pop out the [
                StringBuilder numString = new StringBuilder();
                while(!stack.isEmpty()&&Character.isDigit(stack.peekLast())){
                    numString.append(stack.removeLast());
                }
                //fetch the numer
                numString.reverse();
                int number = Integer.parseInt(numString.toString());
                for(int c=0;c<number;c++){
                    for(int j=0; j<decodedString.size();j++){
                        stack.addLast(decodedString.get(j));
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