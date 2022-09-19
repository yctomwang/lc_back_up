/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 50.34 %
    Runtime : 1 ms
    Memory Usage : 42.2 MB
    Testcase : 60 / 60 passed
    Ranking : 
        Your runtime beats 100.00 % of java submissions.
        Your memory usage beats 92.75 % of java submissions.
}
*/

// class Solution {
//     public String reverseStr(String s, int k) {
//         char[] a = s.toCharArray();
        
//         for (int c =0 ; c < a.length; c+=2*k){
//         // the c+k-1 and a.length-1 is because when k =3 and we only have 2 to the right
//           for (int i = c, j = (c+k)-1; i < j; i++, j--) {
//              char temp = a[i];
//              a[i]=a[j];
//              a[j]=temp;
            
            
//         }
        
        

        

               
//     } 
//         return new String(a);
// }}

class Solution {
    public String reverseStr(String s, int k) {
        char[] a = s.toCharArray();
        for (int c=0; c < a.length; c+=2*k){
        int left =c;
        int right = Math.min(c + k - 1, a.length - 1);
        // the whole idea for having left<right, is then that left==right, we dont swap
        //this covers like string case of just 1 
        while(left<=right){
            char temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
              
        }
        }
         return new String(a);
        
    }
}