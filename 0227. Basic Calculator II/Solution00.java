/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 42.06 %
    Runtime : 48 ms
    Memory Usage : 54.6 MB
    Testcase : 109 / 109 passed
    Ranking : 
        Your runtime beats 15.32 % of java submissions.
        Your memory usage beats 10.90 % of java submissions.
}
*/

class Solution {
    public int calculate(String s) {
    ArrayDeque<Integer> stack = new ArrayDeque<>();
    s=s.replaceAll(" ","");
    int number=0;
    char sign ='+';
    for(int i=0; i<s.length();i++){
        if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
           
            StringBuilder numberfetched = new StringBuilder();
            while(i<s.length()&&(s.charAt(i)>='0'&&s.charAt(i)<='9')){
                numberfetched.append(s.charAt(i));
                number = Integer.parseInt(numberfetched.toString());
                i++;
            }
            //to revert things
            i--;

            
        }
        
        else if(sign=='+'||sign=='-'||sign=='*'||sign=='/'){
            if(sign=='+'){
                stack.addLast(number);
            }else if(sign=='-'){
                stack.addLast(-number);
            }
            else if(sign=='*'){
                int multi=stack.removeLast();
                stack.addLast(multi*number);
            }
            else if(sign=='/'){
                int div=stack.removeLast();
                stack.addLast(div/number);
            }
            if(s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='*'||s.charAt(i)=='/'){
                sign=s.charAt(i);
                number=0;
            }      
       
    }
      
    
    }
        
         if(sign=='+'){
                stack.addLast(number);
            }else if(sign=='-'){
                stack.addLast(-number);
            }
            else if(sign=='*'){
                int multi=stack.removeLast();
                stack.addLast(multi*number);
            }
            else if(sign=='/'){
                int div=stack.removeLast();
                stack.addLast(div/number);
            }
    int answer=0; 
    for(int a:stack){
        answer+=a;
    }
    //System.out.println(stack.toString());
    return answer;
}
}