/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 36.94 %
    Runtime : 3 ms
    Memory Usage : 41.7 MB
    Testcase : 1017 / 1017 passed
    Ranking : 
        Your runtime beats 40.74 % of java submissions.
        Your memory usage beats 27.64 % of java submissions.
}
*/

class Solution {
    public int mySqrt(int x) {
        int left =0;
        int right=x;
        
        while(left<=right){
            int middle = left+(right-left)/2;
            //System.out.println(middle);
            if(isBigger(middle, x)==true){right=middle-1;}
            else if((long)middle*middle==x){
                return middle;
            }
            else{
                left=middle+1;
            }
        }
        return right;
    }
    
    public boolean isBigger(int num, int target){
        if((long)num*num>target){
            return true;
        }
        return false;
    }
}