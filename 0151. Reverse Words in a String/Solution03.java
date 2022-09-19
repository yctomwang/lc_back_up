/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 29.90 %
    Runtime : 4 ms
    Memory Usage : 43.1 MB
    Testcase : 58 / 58 passed
    Ranking : 
        Your runtime beats 96.27 % of java submissions.
        Your memory usage beats 79.38 % of java submissions.
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
    
   // System.out.println(arr[leftidx]);
    int newstart=start;
    int newend=start;

        
    while(newend<leftidx){
        //System.out.println(newend);
        while(newend<leftidx&&arr[newend]!=' '){
            newend++;
            
        }
        if((arr[newend-1]!=' '&&newend<arr.length&&(arr[newend]==' '||newend==leftidx))||(arr[newend-1]!=' '&&newend==arr.length)){
            int newend2=newend-1;
             
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
      
   return new String(arr,start,leftidx-start);
        
    }
}