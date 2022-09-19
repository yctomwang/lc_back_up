/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 49.87 %
    Runtime : 89 ms
    Memory Usage : 101.2 MB
    Testcase : 219 / 219 passed
    Ranking : 
        Your runtime beats 56.52 % of java submissions.
        Your memory usage beats 19.74 % of java submissions.
}
*/

class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        //find the max products given to any store
        int left=1;
        //how are we suppose to find the upperbound
        int right=1;
        
        for(int i=0; i<quantities.length;i++){
            right=Math.max(right,quantities[i]);
        }
        //System.out.println(right);
        while(left<=right){
            int mid = left+(right-left)/2;
            if(helper(mid,n,quantities)==true){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
            
        }
        
        return left;
    }
    //a helper method that can help to solve
    //numsPerStore is the maxium toys we can have at a store
    public boolean helper(int numPerStore, int n, int[] quant){
        //how many stores we need
        int count=0;
        for(int x: quant){
            int div = x/numPerStore;
            //if any left overs
            if(x%numPerStore!=0)count++;
             count+=div; 
        }
        return count<=n;
    }
    


}