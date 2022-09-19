/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 43.94 %
    Runtime : 56 ms
    Memory Usage : 43.7 MB
    Testcase : 107 / 107 passed
    Ranking : 
        Your runtime beats 30.28 % of java submissions.
        Your memory usage beats 41.18 % of java submissions.
}
*/

class Solution {
    public boolean checkInclusion(String s1, String s2) {
    String s =s2;
    String p= s1;
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
            
            if(window.get(curr)<=ana.get(curr)){
                //window.put(curr,window.getOrDefault(curr,0)+1);
                valid++;
                }
        }
        //p=abc= valid =3 ana a:1 b:1 c:1
        //ac window a:1 b:0 c:1 valid =3
        //eabgc
        while((valid==p.length()&&(i-left+1)>p.length())){
            //out
            //System.out.println("jelo");
            char out = s.charAt(left);
            if(ana.getOrDefault(out,0)>0){
              window.put(out,window.get(out)-1);
                if(window.get(out)<ana.get(out)){
                valid--;
                }  
            }
            
            left++;
            
        }
        //abc
        if(valid==p.length()&&(i-left+1)==p.length()){
            return true;
        }
       
    }
        
    return false;
    }
}