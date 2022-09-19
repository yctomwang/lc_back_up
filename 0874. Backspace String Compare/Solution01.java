/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 47.98 %
    Runtime : 5 ms
    Memory Usage : 42.2 MB
    Testcase : 114 / 114 passed
    Ranking : 
        Your runtime beats 26.47 % of java submissions.
        Your memory usage beats 49.49 % of java submissions.
}
*/

class Solution {
    public boolean backspaceCompare(String s, String t) {
//         char[] s1 = s.toCharArray();
//         char[] t1= t.toCharArray();
        //we can use double pointers
        
        Stack<Character> stacks1 = new Stack<Character>();
        Stack<Character> stackt1 = new Stack<Character>();
        
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)!='#'){
                stacks1.push(s.charAt(i));
                }else{
                if(!stacks1.isEmpty())
                stacks1.pop();
            }
        }
        
        for(int i=0; i<t.length();i++){
            if(t.charAt(i)!='#'){
                stackt1.push(t.charAt(i));
                }
            else{
                if(!stackt1.isEmpty())
                stackt1.pop();
            }
        }
        String a =stacks1.toString();
        String b= stackt1.toString();
        // System.out.println(a);
        // System.out.println(b);
        if(a.equals(b)==true) return true;
        return false;
    }
}