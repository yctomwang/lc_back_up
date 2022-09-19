/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 64.33 %
    Runtime : 14 ms
    Memory Usage : 54.8 MB
    Testcase : 85 / 85 passed
    Ranking : 
        Your runtime beats 52.39 % of java submissions.
        Your memory usage beats 11.97 % of java submissions.
}
*/

class Solution {
    public int shipWithinDays(int[] weights, int days) {
        //we need to search through the weight via binary search
        //we need to find the smallest weight
        //so we first
        int left=0;
        int right=0;
       
        for(int i=0;i<weights.length;i++){
            right+=weights[i];
            
        }
        while(left<=right){
            int mid=left+(right-left)/2;
            if(helper(weights,days,mid)==true){
                right=mid-1;
            }
            else{left=mid+1;}
        }
        //System.out.println(helper(weights,days,2));
        return left;
    }
    
    //return true if we could ship
    public boolean helper(int[] weights, int days, int cap){
        int currSum=0;
        int day=1;
        for(int i= 0;i<weights.length;i++){
            if(weights[i]>cap) return false;
            else if(currSum+weights[i]>cap){
                day++;
                currSum=weights[i];
            }else{currSum+=weights[i];}
        }
        //System.out.println(day);
        if(day<=days)return true;
        return false;
    }
}