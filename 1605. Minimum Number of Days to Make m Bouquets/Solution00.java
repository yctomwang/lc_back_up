/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 56.81 %
    Runtime : 34 ms
    Memory Usage : 50.2 MB
    Testcase : 91 / 91 passed
    Ranking : 
        Your runtime beats 44.73 % of java submissions.
        Your memory usage beats 99.23 % of java submissions.
}
*/

public class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int low  = Arrays.stream(bloomDay).min().getAsInt();
        int high =  Arrays.stream(bloomDay).max().getAsInt();

        int  ans = -1;

        while (low<=high){
            int mid = low+(high-low)/2;

            if(isPossible(bloomDay,mid,k,m)){
                ans=mid;
                high=mid-1;
            }
            else {

                low=mid+1;
            }
        }

        return ans;
    }

    private boolean isPossible(int[] bloomDay, int mid, int k,int booket) {
        int bouquets = 0, flowersCollected = 0;
        for (int value : bloomDay) {
            if (value <= mid) {
//                If the current flower can be taken with in days then increase the flower flowersCollected.
                flowersCollected++;
            } else {
//                If there is a flower in between that takes more number of days then the given day, then resent the counter.
                flowersCollected = 0;
            }
//            If the flowersCollected is same as the required flower per bookie, then increase the bouquets count;
            if (flowersCollected == k) {
                bouquets++;
                flowersCollected = 0;
            }
        }

        return bouquets>=booket;

    }
}
