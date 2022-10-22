/*
Submission Detail:{
    Difficulty : Hard
    Acceptance Rate : 40.66 %
    Runtime : 16 ms
    Memory Usage : 51.7 MB
    Testcase : 48 / 48 passed
    Ranking : 
        Your runtime beats 21.03 % of java submissions.
        Your memory usage beats 48.48 % of java submissions.
}
*/

class Solution {
    public int candy(int[] ratings) {
        int[] left = new int[ratings.length];
        int[] right = new int[ratings.length];
        Arrays.fill(left,1);
        Arrays.fill(right,1);
        
        for(int i=1;i<ratings.length;i++){
            if(ratings[i]>ratings[i-1]){
                left[i] = left[i-1]+1;
            }
        }
        
        for(int i= ratings.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                right[i]=right[i+1]+1;
                
            }
        }
        
        int answer=0;
        for(int i=0;i<ratings.length;i++) answer+= Math.max(left[i],right[i]);
        
        
        return answer;
        
    }
}