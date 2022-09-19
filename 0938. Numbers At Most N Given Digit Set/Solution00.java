/*
Submission Detail:{
    Difficulty : Hard
    Acceptance Rate : 41.34 %
    Runtime : 1 ms
    Memory Usage : 39.7 MB
    Testcase : 84 / 84 passed
    Ranking : 
        Your runtime beats 89.56 % of java submissions.
        Your memory usage beats 94.94 % of java submissions.
}
*/

class Solution {
    public int atMostNGivenDigitSet(String[] digits, int nn) {
        String tt=String.valueOf(nn);
        int n=tt.length();
        int m=digits.length;
        int ans=0;
        for(int i=1;i<n;i++){
            ans+=Math.pow(m,i);
        }
        Arrays.sort(digits);
        for(int i=0;i<n;i++){
            boolean todo=false;
            for(String s:digits){
                if(tt.charAt(i)>s.charAt(0)){
                    ans+=Math.pow(m,n-i-1);
                }
                else if(tt.charAt(i)==s.charAt(0)){
                    todo=true;
                }
            }
            if(todo==false)return ans;
        }
        return ans+1;
    }
}