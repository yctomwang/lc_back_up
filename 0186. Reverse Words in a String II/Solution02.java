/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 52.11 %
    Runtime : 2 ms
    Memory Usage : 55.5 MB
    Testcase : 17 / 17 passed
    Ranking : 
        Your runtime beats 76.41 % of java submissions.
        Your memory usage beats 40.18 % of java submissions.
}
*/

class Solution {
    public void reverseWords(char[] arr) {
    int left=0;
    int right= arr.length-1;
    //reverse whole string
    while(left<right){
        char temp = arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        right--;
        left++;
    }
    
    //set up a left pointer
    int start=0;
    //reverse each word except for last
    for(int i=0;i<arr.length;i++){
        if(arr[i]==' '){
            int end=i-1;
            while(start<end){
                char temp = arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
            start=i+1;
        }
    }
    
    //deal with the corner case of leftover last word since there exists no white space after
        
  
    int end = arr.length-1;
    while(start<end){
        char temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        end--;
        start++;
    }
    }
}