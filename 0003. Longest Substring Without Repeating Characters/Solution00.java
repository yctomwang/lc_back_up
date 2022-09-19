/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 33.70 %
    Runtime : 19 ms
    Memory Usage : 43.9 MB
    Testcase : 987 / 987 passed
    Ranking : 
        Your runtime beats 29.88 % of java submissions.
        Your memory usage beats 80.33 % of java submissions.
}
*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
    //this is for the index
    int left=0;
    int answer=0;
    //this is to store character and how many times it appears
    Map<Character, Integer> window= new HashMap<Character, Integer>();
    for(int i=0;i<s.length();i++){
        char curr= s.charAt(i);
        window.put(curr,window.getOrDefault(curr,0)+1);
        while(window.get(curr)>1){
            //substring is no longer valid
            //so we reduce by incrementing left
            //cb
            window.put(s.charAt(left),window.getOrDefault(s.charAt(left),0)-1);
            left++;
        }
        //we can calucate compare or blah
        answer=Math.max(answer,i-left+1);
        
        
    }
        
    
        
        
    return answer;
        
    }
}