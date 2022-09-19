/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 59.10 %
    Runtime : 305 ms
    Memory Usage : 71.5 MB
    Testcase : 93 / 93 passed
    Ranking : 
        Your runtime beats 00.00 % of submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
//     public int maxConsecutiveAnswers(String answerKey, int k) {
        
//     }
    private int findMax(Map<Character,Integer> map){
        int maximum=0;
        for (char name : map.keySet()){
            
            maximum=Math.max(maximum,map.get(name));
        }
        
        return maximum;
    }
    
    public int maxConsecutiveAnswers(String s, int k) {
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
                if(window.get(reduce)==0){
                    window.remove(reduce);
                }
              
                left++;
            }
            
            answer=Math.max(answer,i-left+1);
        }
        
        return answer;
        
        
    }
}