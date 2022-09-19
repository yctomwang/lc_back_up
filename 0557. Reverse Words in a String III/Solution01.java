/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 80.06 %
    Runtime : 8 ms
    Memory Usage : 49.3 MB
    Testcase : 29 / 29 passed
    Ranking : 
        Your runtime beats 73.38 % of java submissions.
        Your memory usage beats 65.04 % of java submissions.
}
*/

class Solution {
    public String reverseWords(String s) {
       char[] arr= s.toCharArray();
        
        int n=arr.length-1;
        
        int left=0;
        int right=0;
        while(right<n+1){
            if(arr[right]!=' '){
                right++;
                //continue;
            }
            
            else if(arr[right]==' '){
                int end = right-1;
                while(left<end){
                    char tmp = arr[left];
                    arr[left]= arr[end];
                    arr[end]=tmp;
                    left++;
                    end--;
                    
                }
                
                left=right+1;
                right++;
                
                
            }
        }
        
        //deal with the last word
        
        int end2=n;
        while(left<end2){
            char tmep= arr[left];
            arr[left]=arr[end2];
            arr[end2]=tmep;
            left++;
            end2--;
        }
        
        System.out.println(arr);
        
        return new String(arr,0,n+1);
        
    }
}