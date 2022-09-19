/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 73.31 %
    Runtime : 5 ms
    Memory Usage : 54.3 MB
    Testcase : 63 / 63 passed
    Ranking : 
        Your runtime beats 65.86 % of java submissions.
        Your memory usage beats 45.37 % of java submissions.
}
*/

class Solution {
    public List<String> answer = new ArrayList<>();
    //public StringBuilder s1;
    public List<String> letterCasePermutation(String s) {
        backTrack(s,0,new StringBuilder(s));
        return answer;
    }
    
    
    public void backTrack(String s, int index,StringBuilder s1){
        //termination conditon
        if(index==s.length()){
            answer.add(s1.toString());
            return;
        }
        
        
        if(Character.isLetter(s.charAt(index))==true){
            //StringBuilder s0= new StringBuilder(s1);
            StringBuilder s2 = new StringBuilder(s1);
            if(Character.isUpperCase(s.charAt(index))==true){
                s2.setCharAt(index,Character.toLowerCase(s.charAt(index)));
            }else{
                s2.setCharAt(index,Character.toUpperCase(s.charAt(index)));
            }
            //s2.setCharAt(index);
            backTrack(s,index+1,s1);
            backTrack(s,index+1,s2);
        }else{
            backTrack(s,index+1,s1);
        }
    
    }
}