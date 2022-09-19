/*
Submission Detail:{
    Difficulty : Hard
    Acceptance Rate : 39.85 %
    Runtime : 14 ms
    Memory Usage : 43 MB
    Testcase : 266 / 266 passed
    Ranking : 
        Your runtime beats 75.84 % of java submissions.
        Your memory usage beats 91.39 % of java submissions.
}
*/

class Solution {
    public String minWindow(String s, String p) {
         
    //a map that stores the what we need
    Map<Character, Integer> ana = new HashMap<Character, Integer>();
    // a hashmap that stores what we have in the current window
    Map<Character, Integer> window = new HashMap<Character, Integer>();
    int valid=0;
    //poluate the ana map
    int start=0;
    int length= Integer.MAX_VALUE;
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
        while(valid==p.length()){
            //out
            if((i-left)<length){
                start=left;
                length=i-left;
            }
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
//         if(valid==p.length()&&(i-left+1)==p.length()){
//             System.out.println("hello");
//             return s.substring(left,i);
//         }
        
        
       
    }
    if(length==Integer.MAX_VALUE) {
        return "";
    } else{
        return s.substring(start,start+length+1);
    }
    
    }
}