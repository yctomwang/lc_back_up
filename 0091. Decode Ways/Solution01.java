/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 32.18 %
    Runtime : 31 ms
    Memory Usage : 42.3 MB
    Testcase : 269 / 269 passed
    Ranking : 
        Your memory usage beats 57.24 % of java submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    int [] memo;
    public int numDecodings(String s) {
        memo= new int[s.length()+1];
        
        //deal with corner case
        if(s==null||s.charAt(0)=='0'||s.length()==0){
            return 0;
        }
        return dfs(s,0);
        
    }
    
    
    public int dfs(String s, int i){
        //when we reached end, we return 1
        if(i==s.length()) return 1;
        //for every round of decisions
        //we have 2 choices, either chose to decode 1 digit or 2 digits, then it will
        //generate to the next state
        //once state reaches the end, then we return 1
        if(memo[i]>0) return memo[i];
        if(s.charAt(i)=='0') return 0;
        else if(i+1<s.length()&&(s.charAt(i)=='1'||s.charAt(i)=='2'&&s.charAt(i+1)<'7')){
            memo[i]=dfs(s,i+1)+dfs(s,i+2);
        }else{
            memo[i]=dfs(s,i+1);
        }
        return memo[i];
        //if both digits work
        //if only 1 digit works
        
    }
}