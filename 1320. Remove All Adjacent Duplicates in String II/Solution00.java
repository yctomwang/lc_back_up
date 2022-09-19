/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 55.98 %
    Runtime : 46 ms
    Memory Usage : 54.8 MB
    Testcase : 21 / 21 passed
    Ranking : 
        Your runtime beats 74.74 % of java submissions.
        Your memory usage beats 22.09 % of java submissions.
}
*/

class Solution {
    public String removeDuplicates(String s, int k) {
        //deeedbbcccbdaa
        //can we use a count?
        
       ArrayDeque<Object[]> stack = new ArrayDeque<>();
   
        for(int i=0;i<s.length();i++){
            //push into stack
            if(stack.isEmpty()||s.charAt(i)!=(char)stack.peekLast()[0]){
                stack.addLast(new Object[]{s.charAt(i),1});
            }
            else if(s.charAt(i)==(char)stack.peekLast()[0]){
                int ans=(int)stack.peekLast()[1];
                stack.addLast(new Object[]{s.charAt(i),ans+1});
            }
            int count=0;
            if((int)stack.peekLast()[1]==k){
                while(count<k&&!stack.isEmpty()){
                    stack.removeLast();
                    count++;
                }
            }
            
            
            
        }
        StringBuilder s1 = new StringBuilder();
        for(Object[] a: stack){
            s1.append((char)a[0]);
        }
        
        return s1.toString();
    }
}