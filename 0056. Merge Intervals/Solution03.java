/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 45.73 %
    Runtime : 14 ms
    Memory Usage : 55.1 MB
    Testcase : 169 / 169 passed
    Ranking : 
        Your runtime beats 61.19 % of java submissions.
        Your memory usage beats 67.40 % of java submissions.
}
*/

class Solution {
    public int[][] merge(int[][] intervals) {
        //sort interval by start time
        //if [i].start<[i+1].start
        //and [i] end> [i+1].start
        //we merge 
        
        List<int[]> answer = new ArrayList<>();
      
        
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        // Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int[] prev= intervals[0];
        for(int i=1; i<intervals.length;i++){
            //if the previous ending time is > current'start
          if(prev[1]>=intervals[i][0]){
              prev[1]=Math.max(prev[1],intervals[i][1]);
          }else{
              answer.add(prev);
              prev=intervals[i];
          }
        }
        
        answer.add(prev);
        //little note to myself
        //when using the toArray method, you can pass in any 
        //length thats smaller than the arraylist you want to conver
        return answer.toArray(new int[0][]);
    }
}