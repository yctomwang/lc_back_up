/*
Submission Detail:{
    Difficulty : Hard
    Acceptance Rate : 56.79 %
    Runtime : 15 ms
    Memory Usage : 50.4 MB
    Testcase : 23 / 23 passed
    Ranking : 
        Your runtime beats 11.84 % of java submissions.
        Your memory usage beats 56.67 % of java submissions.
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
            
            if(totalchoc>=mid)divide++;
        }
        // System.out.println("sweetness"+mid);
        // System.out.println("number div"+divide);
        
        return divide-1;
    }
}