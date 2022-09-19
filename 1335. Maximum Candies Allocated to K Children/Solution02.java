/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 35.74 %
    Runtime : 46 ms
    Memory Usage : 58.5 MB
    Testcase : 100 / 100 passed
    Ranking : 
        Your runtime beats 83.19 % of java submissions.
        Your memory usage beats 87.77 % of java submissions.
}
*/

class Solution {
    public int maximumCandies(int[] candies, long k) {
        int left=0;
        int right=0;
        long totalCandy=0;
        for(int i=0;i<candies.length;i++){
           right=Math.max(right,candies[i]);
            totalCandy+=candies[i];
        }
        if(totalCandy<k){
            //System.out.println("hi");
            return 0;}
        
        if(candies.length==1){
            long candy= candies[0];
            long val = candy/k;
            System.out.println(val);
            //int patch = Math.floor(val);
            int patch= Math.floorDiv((int)candy, (int)k);
            return patch;
        }
        
        while(left<=right){
            int mid= left+(right-left)/2;
            if(isValid(mid, candies,k)==true){
                left=mid+1;
            }
            else{right=mid-1;}
           
        }
        // System.out.println(left);
        // System.out.println(right);
        return right;
    }
    
    
    //
    public boolean isValid(int mid, int[] candies, long k){
        long legalcount=0;
       
        for(int i=0;i<candies.length;i++){
            //candies[i]%mid
            if(mid==0)return true;
            //System.out.println(mid);
            legalcount+= Math.floorDiv(candies[i], mid);
        }
        
        if(legalcount>=k) return true;
        return false;
    }
}