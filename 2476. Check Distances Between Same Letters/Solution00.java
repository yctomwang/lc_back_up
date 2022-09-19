/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 70.77 %
    Runtime : 4 ms
    Memory Usage : 44.2 MB
    Testcase : 335 / 335 passed
    Ranking : 
        Your runtime beats 34.16 % of java submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    public boolean checkDistances(String s, int[] distance) {
    Map<Character,Integer> map = new HashMap<>();
    Map<Character,Integer> last = new HashMap<>();
        
        
    for(int i=0;i<s.length();i++){
        char curr= s.charAt(i);
        if(!map.containsKey(curr)){
            map.put(curr,i);
        } else if(map.containsKey(curr)){
            last.put(curr,i);
        }
    }
    
    for(char j='a';j<='z';j++){
        if(map.containsKey(j)){
            int first=map.get(j);
            int lastoccer= last.get(j);
            if((lastoccer-first-1)!=distance[j-'a']){
                return false;
            }
        }
    }
        
        
    return true;    
        
    }
}