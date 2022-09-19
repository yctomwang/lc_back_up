/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 29.90 %
    Runtime : 68 ms
    Memory Usage : 45.3 MB
    Testcase : 58 / 58 passed
    Ranking : 
        Your memory usage beats 36.00 % of java submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    public String reverseWords(String s) {
    
    int left=0;
    int right= s.length()-1;
    char [] arr = s.toCharArray();
    
    // to remove trailing white space
    while(left<right&&arr[left]==' ')left++;
    //to remove ending white space
    while(right>left&&arr[right]==' ') right--;
    int start=left;
    int end=right;
    System.out.println(start);
    System.out.println(end);
    System.out.println("aaarr"+arr.length);
    //reverse the whole string
  
    while(left<right){
        char temp = arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        right--;
        left++;
    }
    
    //revert each word
   
    //fast and slow pointer to remove duplicate white space
    
    int leftidx=start;
    int rightidx=start;
    while(rightidx<=end){
        if(arr[rightidx]!=' '){
            arr[leftidx]=arr[rightidx];
            leftidx++;
            rightidx++;
        }else if(arr[rightidx]==' '&&arr[rightidx-1]!=' '){
            arr[leftidx]=arr[rightidx];
            leftidx++;
            rightidx++;
        }
        else{
            rightidx++;
        }
    }
    
    
        
    
   System.out.println(arr);
System.out.println("rightidx after white"+rightidx);
        System.out.println("leftidx aftee white"+leftidx);
   // System.out.println(arr[leftidx]);
    int newstart=start;
    int newend=start;
    System.out.println("this is stat"+start);
        
    while(newend<leftidx){
        //System.out.println(newend);
        while(newend<leftidx&&arr[newend]!=' '){
            newend++;
            
        }
        if((arr[newend-1]!=' '&&newend<arr.length&&(arr[newend]==' '||newend==leftidx))||(arr[newend-1]!=' '&&newend==arr.length)){
            int newend2=newend-1;
             System.out.println(newstart+"newstart");
                System.out.println(newend2+"newend2");
            System.out.println(leftidx);
            while(newstart<newend2&&newend2<leftidx){
               
                char temp = arr[newstart];
                arr[newstart]=arr[newend2];
                arr[newend2]=temp;
                newstart++;
                newend2--;
                
            }
            newstart= newend+1;
            newend++;
        }
        
        
    }
        
      System.out.println(arr);
   return new String(arr,start,leftidx-start);
        
    }
}