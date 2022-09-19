/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 42.76 %
    Runtime : 16 ms
    Memory Usage : 38.8 MB
    Testcase : 23 / 23 passed
    Ranking : 
        Your runtime beats 97.43 % of java submissions.
        Your memory usage beats 98.45 % of java submissions.
}
*/

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int leftindex=1;
        int rightindex=n;
        while(leftindex<=rightindex){
            int mid= leftindex+(rightindex-leftindex)/2;
            //if the thing is a bad item
            if(isBadVersion(mid)){
                
                rightindex=mid-1;
            }
            else{
                leftindex=mid+1;
            }
            
        }
        return leftindex;
        
        
    }
}