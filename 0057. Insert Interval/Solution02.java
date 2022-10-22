/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 37.94 %
    Runtime : 2 ms
    Memory Usage : 48.2 MB
    Testcase : 156 / 156 passed
    Ranking : 
        Your runtime beats 85.77 % of java submissions.
        Your memory usage beats 14.30 % of java submissions.
}
*/

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        // new interval is before new___ ___ ___
        // new interval spans across
        if(intervals.length==0){
            return new int[][]{newInterval};
        }
        List<int[]> answer = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int[] to_be_added = newInterval;
        boolean flag = false;
        for(int i=0;i<intervals.length;i++){
            int[] curr = intervals[i];
            int start= curr[0];
            int end = curr[1];
            //if interval
            if(start<to_be_added[1]&&end<to_be_added[0]){
                //System.out.println("hello");
                answer.add(curr);
            }
            else if(start<=to_be_added[1]&&end>=to_be_added[0]){
                
                to_be_added[0] = Math.min(to_be_added[0],curr[0]);
                to_be_added[1] = Math.max(to_be_added[1],curr[1]);
            }
            else{
                //System.out.println("hello");
                if(flag==false){
                    answer.add(to_be_added);
                    flag=true;
                }
                answer.add(curr);
            }
        }
        if(flag==false){
            answer.add(to_be_added);
        }
        
        int[][] array = new int[answer.size()][];
        for(int i=0;i<array.length;i++){
            array[i]=answer.get(i);
        }
        
        return array;
    }
}