/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 42.76 %
    Runtime : 27 ms
    Memory Usage : 41.4 MB
    Testcase : 23 / 23 passed
    Ranking : 
        Your runtime beats 39.30 % of java submissions.
        Your memory usage beats 10.49 % of java submissions.
}
*/

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        //this could be done with binary search
        //finding the left bound
        int leftindex=1;
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
        return leftindex;
        
        
    }
}