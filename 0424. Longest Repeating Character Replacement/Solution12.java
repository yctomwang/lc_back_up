/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 51.28 %
    Runtime : 189 ms
    Memory Usage : 53.7 MB
    Testcase : 37 / 37 passed
    Ranking : 
        Your memory usage beats 7.29 % of java submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    
    private int findMax(Map<Character,Integer> map){
        int maximum=0;
        for (char name : map.keySet()){
            
            maximum=Math.max(maximum,map.get(name));
        }
        
        return maximum;
    }
    
    public int characterReplacement(String s, int k) {
        //this is another sliding winow question
        int answer=0;
        Map<Character, Integer> window = new HashMap<Character, Integer>();
        int left=0;
        for(int i=0; i<s.length();i++){
            char curr= s.charAt(i);
            window.put(curr, window.getOrDefault(curr,0)+1);
            
            
            while(((i-left+1)-findMax(window))>k){
                //this is for reducing 
                char reduce = s.charAt(left);
                
                window.put(reduce,window.get(reduce)-1);
              
                left++;
            }
            
            answer=Math.max(answer,i-left+1);
        }
        
        return answer;
        
        
    }
}