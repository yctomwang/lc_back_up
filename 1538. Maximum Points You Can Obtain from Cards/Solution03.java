/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 52.30 %
    Runtime : 798 ms
    Memory Usage : 76.2 MB
    Testcase : 40 / 40 passed
    Ranking : 
        Your runtime beats 00.00 % of submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    public int maxScore(int[] cardPoints, int k) {
        //find a subarray with k-n length with minimum value;
        int totalpoints =0;
        for(int j=0;j<cardPoints.length;j++){
            totalpoints+=cardPoints[j];
        }
        
        
        int globalmax=Integer.MAX_VALUE;
        int currentsum=0;
        int left=0;
        for(int i=0;i<cardPoints.length;i++){
            
            //in
            currentsum+=cardPoints[i];
            while(i-left+1>(cardPoints.length-k)){
                currentsum-=cardPoints[left];
                
                left++;
            }
            
            if(i-left+1==(cardPoints.length-k)){
                globalmax=Math.min(globalmax,currentsum);
                System.out.println("i"+i);
                System.out.println("left"+left);
            }
            
        }
        //System.out.println(totalpoints);
         
        
        return totalpoints-globalmax;
    }
}