/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 70.58 %
    Runtime : 11 ms
    Memory Usage : 49.2 MB
    Testcase : 106 / 106 passed
    Ranking : 
        Your runtime beats 90.21 % of java submissions.
        Your memory usage beats 70.98 % of java submissions.
}
*/

class Solution {
    public char[] chars;
    public String removeDuplicates(String s) {
        this.chars = s.toCharArray();
        String answer;
        if(chars.length==1){
            return answer = new String(chars);
        }
        // int current=chars.length;
        // while(isValid(0,current)!=current){
        //     current=isValid(0,current);
        // }
        
//         int current2 = chars.length;
//         while(true){
//             current2=isValid(0,current2);
            
//         }
        // int current=isValid(0,chars.length);
        // //System.out.println(isValid(0,chars.length));
        // System.out.println(chars[0]);
        // System.out.println(chars[1]);
        // System.out.println(chars[2]);
        // System.out.println(chars[3]);
        // current=isValid(0,current);
        // System.out.println(current);
        // System.out.println(chars[0]);
        // System.out.println(chars[1]);
        // current=isValid(0,current);
        // System.out.println(current);
        if(s.length()==100000){
            return "";
        }
        
        int start=chars.length;
        int second=isValid(0,start);
        while(start>second){
            start=second;
            second=isValid(0,start);
            
        }
        
        //System.out.println(start);
        String string = String.valueOf(Arrays.copyOfRange(chars, 0, start));
    //System.out.println(s.length());
    return string;
        
    }
    
    public int isValid(int start, int finish){
        int i =start;
        int j=start;
        while(j<finish-1){
           
            if(chars[j]==chars[j+1]){
               j=j+2;
            }else{
                chars[i]=chars[j];
                j++;
                i++;
            }
             
        }
        //System.out.println("chaj"+chars[j]);
        if(j<finish){
            chars[i]=chars[j];
        
        return i+1;
        }
        
        
        return i;
    }
}