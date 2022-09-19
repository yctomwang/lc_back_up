/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 50.37 %
    Runtime : 1330 ms
    Memory Usage : 96.5 MB
    Testcase : 124 / 124 passed
    Ranking : 
        Your runtime beats 00.00 % of submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    public int equalCountSubstrings(String s, int k) {
    int answer=0;   
    for(int unique=1; unique<=26; unique++){
        int valid=0;
        int over=0;
        Map<Character, Integer> window = new HashMap<Character, Integer>();
        int left=0;
        
        for(int i=0;i<s.length();i++){
            
            char curr = s.charAt(i);
            window.put(curr, window.getOrDefault(curr,0)+1);
            if(window.get(curr)==k){
                valid++;
            }
            if(window.get(curr)>k){
                over++;
            }
            while(window.keySet().size()>unique||(valid==window.keySet().size()&&over>0)){
                char remove= s.charAt(left);
                if(window.get(remove).equals(k+1)){
                    over--;
                }
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
                // int flag=0;
                // for(char key:window.keySet()){
                //     if(window.get(key)-k!=0){
                //         flag=1;
                //     }
                // }
                if(unique==window.keySet().size()){
                    answer+=1;
                }
                
            }
            
        }
        
    }
        
    return answer;
    }
}