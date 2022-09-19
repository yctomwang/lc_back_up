/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 34.81 %
    Runtime : 3 ms
    Memory Usage : 42.8 MB
    Testcase : 323 / 323 passed
    Ranking : 
        Your runtime beats 26.69 % of java submissions.
        Your memory usage beats 20.52 % of java submissions.
}
*/

class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        /*
        s010n s10n=abbr subsitution=word
        */
        //on on
        //pointer for word
        int i=0;
        //pointer for abbr
        int j=0;
        /*
        so if charAt(i)==charAt(j)
        */
        
        while(i<word.length()&&j<abbr.length()){
            if(word.charAt(i)==abbr.charAt(j)){
                i++;
                j++;
                continue;  
            }
            
            //if abbr!=word
            //we need to check if its a number or not 0,9
            if(abbr.charAt(j)<'0'&&abbr.charAt(j)>'9'){
                return false;
            }
            //here to strip all the integers
            int startindex=j;
            if(abbr.charAt(startindex)=='0'){
                return false;
            }
            while(j<abbr.length()&&abbr.charAt(j)>='0'&&abbr.charAt(j)<='9'){
                // if(j==abbr.length()-1){}
                //     else{j++;}
                j++;
            }
            int number;
            if(startindex==j){
                 number = Character.getNumericValue(abbr.charAt(startindex));
            }else{ number = Integer.valueOf(abbr.substring(startindex, j));}
            
            i+=number;
        }
        
        if(i==word.length()&&j==abbr.length()){
            return true;
        }
        
        return false;
        
    }
}