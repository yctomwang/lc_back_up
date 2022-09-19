/*
Submission Detail:{
    Difficulty : Hard
    Acceptance Rate : 34.70 %
    Runtime : 35 ms
    Memory Usage : 114.6 MB
    Testcase : 55 / 55 passed
    Ranking : 
        Your runtime beats 00.00 % of submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    public long minimumMoney(int[][] transactions) {
        Arrays.sort(transactions,(int a[],int b[])->(a[1]-b[1]));

        long max=0,ans=0,ab=0;
        for(int a[]:transactions){
            if(a[0]>a[1]){
                max+=a[0];
                ans=Math.max(ans,max);
                max-=a[1];
            }
            else ab=Math.max(ab,a[0]);
        }
        ans=Math.max(ans,max+ab);
        return ans;
    }
}