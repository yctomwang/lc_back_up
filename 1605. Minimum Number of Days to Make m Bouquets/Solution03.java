/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 56.81 %
    Runtime : 27 ms
    Memory Usage : 79 MB
    Testcase : 91 / 91 passed
    Ranking : 
        Your runtime beats 74.07 % of java submissions.
        Your memory usage beats 51.21 % of java submissions.
}
*/

class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        //we have to make in total m bouquets
        //each have to use k
        
        if(bloomDay.length<k*m){return -1;}
        
        int maxday=0;
        int minday= Integer.MAX_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]>maxday){
                maxday=bloomDay[i];
            }
            if(bloomDay[i]<minday) minday=bloomDay[i];
        }
        //System.out.println(minday);
        int left=minday;
        int right =maxday;
        
        while(left<=right){
            int middle= left+(right-left)/2;
            if(helper(bloomDay,m,k,middle)==true){
                right=middle-1;
                
            }
            else{
                left=middle+1;
            }
            
        }
        
        
        return right;
    }
    // determine if its possible to make m bouquets in middle days
    public boolean helper(int[] bloom, int m, int k, int days){
        //
        int count =0;
        //we can use a sliding window to do it
        int i=0;
        List<Integer> answer= new ArrayList<>();
        while(i<bloom.length){
            int start=Integer.MAX_VALUE;
            if(bloom[i]<days) start=i;
            while(i<bloom.length&&bloom[i]<days){
                i++;
            }
            if(start!=Integer.MAX_VALUE)answer.add(i-start);
            i++;
        }
        
        //System.out.println(answer.size());
        for(int j=0;j<answer.size();j++){
            //if(answer.get(j))
            //System.out.println("i"+answer.get(j));
            count+=Math.floorDiv(answer.get(j), k);
        }
        
//         int length= bloom.length;
        
//         if(Math.floorDiv(bloom.length, k)<m){
//             return false;
//         }
        if(count<m){return false;}
        return true;
    }
}