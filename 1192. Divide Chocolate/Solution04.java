/*
Submission Detail:{
    Difficulty : Hard
    Acceptance Rate : 56.79 %
    Runtime : 28 ms
    Memory Usage : 51.4 MB
    Testcase : 23 / 23 passed
    Ranking : 
        Your runtime beats 00.00 % of submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    public int maximizeSweetness(int[] sweetness, int k) {
        //translate into humans words
        //we want to maximise the smallest amount of sweetness in any block
        
        int left=Integer.MAX_VALUE;
        int right=0;
        for(int i=0;i<sweetness.length;i++){
            int curr = sweetness[i];
            left=Math.min(curr,left);
            right+=sweetness[i];
        }
        
        while(left<=right){
            int mid= left+(right-left)/2;
            if(helper(sweetness, mid, k)>k){
                left=mid+1;
            }
            else if(helper(sweetness, mid, k)<k){
                right=mid-1;
            } else if(helper(sweetness, mid, k)==k){
                left=mid+1;
            }
        }
        
        return right;
        
    }
    
    public int helper(int[] choc, int mid, int k){
        int divide=0;
        int i=0;
        while(i<choc.length){
            
            int totalchoc=choc[i];
            if(totalchoc>=mid){
                //System.out.println(totalchoc);
                //if(i<choc.length-1)
                divide++;
                i++;
                continue;
                
            }
            totalchoc=0;
            while(totalchoc<mid&&i<choc.length){
                
                totalchoc+=choc[i];
                i++;
            }
            // System.out.println("totalsweetness"+totalchoc);
            // System.out.println("i"+i);
            if(totalchoc>=mid)divide++;
        }
        System.out.println("sweetness"+mid);
        System.out.println("number div"+divide);
        // if(divide>=k) return true;
        // //if(divide<=k)
        //     return false;
        
        return divide-1;
    }
}