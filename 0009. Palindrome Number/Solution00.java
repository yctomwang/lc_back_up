/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 52.76 %
    Runtime : 15 ms
    Memory Usage : 44 MB
    Testcase : 11510 / 11510 passed
    Ranking : 
        Your runtime beats 55.39 % of java submissions.
        Your memory usage beats 80.13 % of java submissions.
}
*/

class Solution {
    public boolean isPalindrome(int x) {
        if(x<0||x%10==0&&x!=0){return false;}
        
        int revertNum=0;
        while(x>revertNum){
            revertNum=revertNum*10+x%10;
            x/=10;
        }
        
        return x==revertNum|| x==revertNum/10;
    }
}