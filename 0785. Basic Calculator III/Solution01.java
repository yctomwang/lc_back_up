/*
Submission Detail:{
    Difficulty : Hard
    Acceptance Rate : 48.46 %
    Runtime : 12 ms
    Memory Usage : 43.9 MB
    Testcase : 79 / 79 passed
    Ranking : 
        Your runtime beats 32.27 % of java submissions.
        Your memory usage beats 11.70 % of java submissions.
}
*/

class Solution {
    //the global interation index
    int i =0;
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        char operator = '+';
        int num =0;
        while(i<s.length()){
            char c = s.charAt(i++);
            if(Character.isDigit(c)){
                num=num*10+(c-'0');
            }
            if(c =='('){
               num= calculate(s);
            }
            
            if(i>=s.length()||c=='+'||c=='-'||c=='*'||c=='/'||c==')'){
                if(operator=='+'){
                    stack.push(num);
                }else if(operator=='-'){
                    stack.push(-num);
                } else if(operator=='*'){
                    stack.push(stack.pop()*num);
                } else if(operator=='/'){
                    stack.push(stack.pop()/num);
                }
                operator =c;
                num=0;
            }
            
            if(c==')') break;
        }
       return stack.stream().mapToInt(x->x).sum();
    }
}