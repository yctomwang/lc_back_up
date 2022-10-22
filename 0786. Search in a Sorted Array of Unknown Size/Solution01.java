/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 71.35 %
    Runtime : 4 ms
    Memory Usage : 55 MB
    Testcase : 47 / 47 passed
    Ranking : 
        Your runtime beats 48.08 % of java submissions.
        Your memory usage beats 12.42 % of java submissions.
}
*/

/**
 * // This is ArrayReader's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface ArrayReader {
 *     public int get(int index) {}
 * }
 */

class Solution {
    public int search(ArrayReader reader, int target) {
        int left=0;
        int right = 10000-1;
        
        while(left<=right){
            int mid = left+(right-left)/2;
            //
            if(reader.get(mid)==Integer.MAX_VALUE||reader.get(mid)>target){
                right= mid -1;
                
            }
            else if(reader.get(mid)<=target){
                left=mid+1;
            }

        }
        // if(reader.get(left)==target){
        //     return left;
        // }
        if(reader.get(right)==target){
            return right;
        }
        
        
        return -1;
    }
}