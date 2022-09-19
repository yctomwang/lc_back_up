/*
Submission Detail:{
    Difficulty : Hard
    Acceptance Rate : 56.79 %
    Runtime : 5 ms
    Memory Usage : 42.5 MB
    Testcase : 23 / 23 passed
    Ranking : 
        Your runtime beats 95.72 % of java submissions.
        Your memory usage beats 98.49 % of java submissions.
}
*/

class Solution {
    public int maximizeSweetness(int[] sweetness, int k) {
        int left=Integer.MAX_VALUE;
        int right=0;
        for(int i=0;i<sweetness.length;i++){
            int curr = sweetness[i];
            left=Math.min(curr,left);
            right+=sweetness[i];
        }
        while(left<=right){
            int mid= left+(right-left)/2;
            if(canSplit(sweetness,k,mid)>=k){
                left=mid+1;
            } else{
                right=mid-1;
            }
        }
        
        return right;
    }
    
    
    private int canSplit(int[] sweetness, int k, int mid){
        int chucks=0;
        int sum=0;
        for(int i=0; i<sweetness.length;i++){
            sum+=sweetness[i];
            if(sum>=mid){
                chucks++;
                sum=0;
            }
        }
        
        return chucks-1;
    }
}