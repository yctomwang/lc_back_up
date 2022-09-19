/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 48.10 %
    Runtime : 54 ms
    Memory Usage : 54.5 MB
    Testcase : 50 / 50 passed
    Ranking : 
        Your runtime beats 44.03 % of java submissions.
        Your memory usage beats 94.99 % of java submissions.
}
*/

class Solution {
    //75-58 done writing 17åéåå®
    //75-50 8åéä¿® bug 
    //total 25åé
    
    
    public int maxLength(int[] ribbons, int k) {
        //find the largest legal length of ribbon
        int left=1;
        int right=0;
        for(int j=0;j<ribbons.length;j++){
            right=Math.max(right,ribbons[j]);
        }
        while(left<=right){
            int mid= left+(right-left)/2;
            if(isValid(ribbons,mid,k)==true){
                left=mid+1;
            }
            
            else{
                right=mid-1;
            }
        }
    
  
       
        //think about when we dont return right
       if(isValid(ribbons,right,k)==false){
           return 0;
       }
        // System.out.println(right);
        // System.out.println(left);
        return right;
        
       
    }
    
    
    //return true if we can obtain k peices of ribbon that are all of length mid or above
    public boolean isValid(int[] ribbons, int mid, int k){
        if(mid==0) return false;
        int count=0;
        for(int r:ribbons){
            count+=Math.floorDiv(r, mid);
        }
        //System.out.println("count"+count);
        if(count>=k){
            return true;
        }
        return false;
    }
}