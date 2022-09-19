/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 61.34 %
    Runtime : 1 ms
    Memory Usage : 39.1 MB
    Testcase : 115 / 115 passed
    Ranking : 
        Your runtime beats 90.71 % of java submissions.
        Your memory usage beats 99.93 % of java submissions.
}
*/

class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr =s.toCharArray();
        
        int start=0;
        int end=arr.length-1;
        /*
        overall thinking was if start!=letter
        then we keep shfiting start
        if end!=letter we keep shifitng end
        if they are equal, we sawp
        */
        
        while(start<end){
            if(Character.isLetter(arr[start])&&Character.isLetter(arr[end])){
                char temp = arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                end--;
                start++;
                continue;
            }
            
         
            if(Character.isLetter(arr[start])==false){
              
                while(start<arr.length&&Character.isLetter(arr[start])==false){
                    start++;
                }
                continue;
            }
               
            else if(end>=0&&Character.isLetter(arr[end])==false){
                while(Character.isLetter(arr[end])==false){
                    end--;
                }
                
            }
                
                
        }
       
        return String.valueOf(arr);
        
    }
    
}