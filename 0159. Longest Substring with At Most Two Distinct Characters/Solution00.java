/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 53.38 %
    Runtime : 71 ms
    Memory Usage : 55 MB
    Testcase : 124 / 124 passed
    Ranking : 
        Your runtime beats 72.79 % of java submissions.
        Your memory usage beats 38.71 % of java submissions.
}
*/

class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int left=0;
        int answer=0;
        //stores all characters and how many times it appears within the map
        Map<Character, Integer> window = new HashMap<Character,Integer>();
        
        
        
        for(int i =0; i<s.length();i++){
            //intake 
            char curr = s.charAt(i);
            window.put(curr, window.getOrDefault(curr,0)+1);
            //aabbb
          
            while(window.size()>2){
                window.put(s.charAt(left),window.get(s.charAt(left))-1);
                
                if(window.get(s.charAt(left))<=0){
                    window.remove(s.charAt(left));
                }
                
                left++;
                    
            }
            
            answer=Math.max(answer,i-left+1);
        }
        
        return answer;
        
    }
}