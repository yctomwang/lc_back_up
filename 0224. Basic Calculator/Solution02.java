/*
Submission Detail:{
    Difficulty : Hard
    Acceptance Rate : 41.13 %
    Runtime : 20 ms
    Memory Usage : 46.9 MB
    Testcase : 44 / 44 passed
    Ranking : 
        Your runtime beats 53.01 % of java submissions.
        Your memory usage beats 21.53 % of java submissions.
}
*/

class Solution {
    //global variable to store the index
    int i =0;
    public int calculate(String s) {
        char operator ='+';
        int num=0;
        Stack<Integer> stack = new Stack();
        while(i<s.length()){
            //do the increment and grab the character
            char curr = s.charAt(i++);
            if(Character.isDigit(curr)){
                num=num*10+(curr-'0');
            }
            if(curr=='('){
                //call recursion
                num=calculate(s);
            }
            if(i>=s.length()||curr=='+'||curr=='-'||curr==')'){
                if(operator=='+'){stack.push(num);}
                else if(operator=='-'){stack.push(-num);}
                operator=curr;
                num=0;
            }
            if(curr==')') break;
            
        }
        
        // int sum=0;
        // while(stack.size()!=0){
        //     sum+=stack.pop();
        // }
        
       return stack.stream().mapToInt(x->x).sum();
        
    }
}