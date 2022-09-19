/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 74.12 %
    Runtime : 15 ms
    Memory Usage : 51.2 MB
    Testcase : 76 / 76 passed
    Ranking : 
        Your runtime beats 47.23 % of java submissions.
        Your memory usage beats 26.32 % of java submissions.
}
*/

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
      Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
        int unitCount=0;
        
        for(int[] box:boxTypes){
           int boxCount = Math.min(truckSize, box[0]);
            unitCount += boxCount * box[1];
            truckSize -= boxCount;
            if (truckSize == 0)
                break; 
        }
        
        return unitCount;
    }
}