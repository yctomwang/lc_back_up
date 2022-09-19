/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 68.65 %
    Runtime : 21 ms
    Memory Usage : 42.7 MB
    Testcase : 113 / 113 passed
    Ranking : 
        Your runtime beats 22.28 % of java submissions.
        Your memory usage beats 49.09 % of java submissions.
}
*/

class Solution {
    public String greatestLetter(String s) {
        Set<Character> upper = new HashSet<>();
        Set<Character> lower = new HashSet<>();
        char answer=Character.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            //deal with the uppercase
            if(Character.isUpperCase(c)==true){
                //System.out.println(c);
                if(upper.contains(c)){
                    if(lower.contains(Character.toLowerCase(c))){
                        
                        if(c>answer) answer=c;
                    }
                    
                }else{
                    upper.add(c);
                    if(lower.contains(Character.toLowerCase(c))){
                        
                        if(c>answer) answer=c;
                    }
                }
            }else{
                if(lower.contains(c)){
                    //System.out.println(c);
                    if(upper.contains(Character.toUpperCase(c))){
                        if(Character.toUpperCase(c)>answer) answer=Character.toUpperCase(c);
                    }
                    
                }else{
                    //System.out.println(c);
                    lower.add(c);
                    if(upper.contains(Character.toUpperCase(c))){
                        if(Character.toUpperCase(c)>answer) answer=Character.toUpperCase(c);
                    }
                }
                
            }
        }
        
        if(answer==Character.MIN_VALUE){
            return "";
        }
        return Character.toString(answer);
        
    }
}