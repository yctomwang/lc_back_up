/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 47.71 %
    Runtime : 23 ms
    Memory Usage : 44.9 MB
    Testcase : 142 / 142 passed
    Ranking : 
        Your runtime beats 28.24 % of java submissions.
        Your memory usage beats 55.65 % of java submissions.
}
*/

class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
      Map<Character, Integer> map = new HashMap<>();
      int left=0;
      int res =0;
        
        
    
    for(int i=0; i<s.length();i++){
        //grab out the char at current
        char current= s.charAt(i);
        map.put(current,map.getOrDefault(current,0)+1);//in
        
        
        while(map.size()>k){
            char c = s.charAt(left);
            map.put(c,map.getOrDefault(c,0)-1);
            if(map.get(c)==0) map.remove(c);
                
            
            left++;
        }
        res=Math.max(res,i-left+1);
//         System.out.println("right"+i);
//         System.out.println("left"+left);
        
//         System.out.println(res);
          
        
        }
        return res;
            
        
            
    }
        
    
    }
