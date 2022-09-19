/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 42.76 %
    Runtime : 26 ms
    Memory Usage : 41 MB
    Testcase : 22 / 22 passed
    Ranking : 
        Your runtime beats 42.98 % of java submissions.
        Your memory usage beats 40.10 % of java submissions.
}
*/

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        //this could be done with binary search
        //finding the left bound
        int leftindex=0;
        int rightindex=n;
        while(leftindex<rightindex){
            int mid= leftindex+(rightindex-leftindex)/2;
            //if the thing is a bad item
            if(isBadVersion(mid)){
                
                rightindex=mid;
            }
            
            else{
                leftindex=mid+1;
            }
            
        }
        return rightindex;
        
        
    }
}