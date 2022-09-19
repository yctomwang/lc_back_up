/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 44.80 %
    Runtime : 42 ms
    Memory Usage : 46.1 MB
    Testcase : 35 / 35 passed
    Ranking : 
        Your runtime beats 28.90 % of java submissions.
        Your memory usage beats 14.55 % of java submissions.
}
*/

class Solution {
    public int longestSubstring(String s, int k) {
    //ababbc  k=2
    //ababcc k=2
    //bcc  unique =2
    //ababcc     unique =3
    int answer=0;   
    for(int unique=1; unique<=26; unique++){
        int valid=0;
        Map<Character, Integer> window = new HashMap<Character, Integer>();
        int left=0;
        
        for(int i=0;i<s.length();i++){
            
            char curr = s.charAt(i);
            window.put(curr, window.getOrDefault(curr,0)+1);
            if(window.get(curr)==k){
                valid++;
            }
            while(window.keySet().size()>unique){
                char remove= s.charAt(left);
                if(window.get(remove)==k){
                    valid--;
                    
                }
                window.put(remove,window.getOrDefault(remove,0)-1);
                //remove the char out of map if it appears 0 times;
                if(window.getOrDefault(remove,0)==0){
                    window.remove(remove);
                }
                left++;
            }
           
            
            if(valid==window.keySet().size()){
                
                answer= Math.max(answer,i-left+1);
            }
            
        }
        
    }
        
    return answer;
    }
}