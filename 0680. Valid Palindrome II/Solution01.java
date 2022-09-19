/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 39.37 %
    Runtime : 14 ms
    Memory Usage : 54.2 MB
    Testcase : 469 / 469 passed
    Ranking : 
        Your runtime beats 40.94 % of java submissions.
        Your memory usage beats 69.84 % of java submissions.
}
*/

class Solution {
    //o(N)
    public boolean validPalindrome(String s) {
        int startindex=0;
        int endindex=s.length()-1;
        while(startindex<endindex){
            if(s.charAt(startindex)==s.charAt(endindex)){
                startindex++;
                endindex--;
            }else{
                return check(s,startindex+1,endindex)||check(s,startindex,endindex-1);
            }
           
        }
        if(startindex>=endindex) return true;
        return true;
        
        
    }
    
    public boolean check(String s, int start, int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}