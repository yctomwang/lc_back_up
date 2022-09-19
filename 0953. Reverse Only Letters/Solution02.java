/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 61.34 %
    Runtime : 0 ms
    Memory Usage : 40.1 MB
    Testcase : 115 / 115 passed
    Ranking : 
        Your runtime beats 100.00 % of java submissions.
        Your memory usage beats 97.64 % of java submissions.
}
*/

class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr =s.toCharArray();
        
        int start=0;
        int end=arr.length-1;
        
        while(start<end){
            if(Character.isLetter(arr[start])&&Character.isLetter(arr[end])){
                char temp = arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                end--;
                start++;
                continue;
            }
            
            // System.out.println("start"+start);
            // System.out.println("end"+end);
            if(Character.isLetter(arr[start])==false){
                //a while loop to shrink
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
    
//     public void swap(char[] arr, int start, int end){
        
//     }
}