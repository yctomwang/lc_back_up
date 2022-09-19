/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 50.34 %
    Runtime : 1 ms
    Memory Usage : 41.9 MB
    Testcase : 60 / 60 passed
    Ranking : 
        Your runtime beats 100.00 % of java submissions.
        Your memory usage beats 99.02 % of java submissions.
}
*/

class Solution {
    public String reverseStr(String s, int k) {
        char[] a = s.toCharArray();
        for (int c =0 ; c < a.length; c+=2*k){
          for (int i = c, j = Math.min((c+k)-1,a.length - 1); i < j; i++, j--) {
             char temp = a[i];
             a[i]=a[j];
             a[j]=temp;
            
            
        }
        
        

        

               
    } 
        return new String(a);
}}

// class Solution {
//     public String reverseStr(String s, int k) {
//         char[] a = s.toCharArray();
//         for (int c=0; c < a.length; c+=2*k){
//         int left =c;
//         int right = Math.min(c + k - 1, a.length - 1);
//         // the whole idea for having left<right, is then that left==right, we dont swap
//         //this covers like string case of just 1 
//         while(left<right){
//             char temp=a[left];
//             a[left]=a[right];
//             a[right]=temp;
//             left++;
//             right--;
              
//         }
//         }
//          return new String(a);
        
//     }
// }