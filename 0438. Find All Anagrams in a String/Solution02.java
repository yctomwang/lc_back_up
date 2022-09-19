/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 48.87 %
    Runtime : 60 ms
    Memory Usage : 49.3 MB
    Testcase : 61 / 61 passed
    Ranking : 
        Your runtime beats 31.57 % of java submissions.
        Your memory usage beats 29.17 % of java submissions.
}
*/

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
    List<Integer> answer = new LinkedList<>();
    //a map that stores the what we need
    Map<Character, Integer> ana = new HashMap<Character, Integer>();
    // a hashmap that stores what we have in the current window
    Map<Character, Integer> window = new HashMap<Character, Integer>();
    int valid=0;
    //poluate the ana map
    for(int j=0; j<p.length();j++){
        char current = p.charAt(j);
        ana.put(current,ana.getOrDefault(current,0)+1);

    }
    int left=0;
        
    for(int i=0;i<s.length();i++){
        char curr = s.charAt(i);
        if(ana.getOrDefault(curr,0)>0){
            
           window.put(curr,window.getOrDefault(curr,0)+1);
            
            if(window.get(curr).equals(ana.get(curr))){
                //window.put(curr,window.getOrDefault(curr,0)+1);
                valid++;
                }
        }
        //p=abc= valid =3 ana a:1 b:1 c:1
        //ac window a:1 b:0 c:1 valid =3
        //eabgc
        while((valid==ana.keySet().size()&&(i-left+1)>p.length())){
            //out
            char out = s.charAt(left);
            if(ana.getOrDefault(out,0)>0){
              window.put(out,window.get(out)-1);
                if(window.get(out).equals(ana.get(out)-1)){
                valid--;
                }  
            }
            
            left++;
            
        }
        //abc
        if(valid==ana.keySet().size()&&(i-left+1)==p.length()){
            answer.add(left);
        }
       
    }
        
    return answer;
    }
}