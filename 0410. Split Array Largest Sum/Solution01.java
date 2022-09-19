/*
Submission Detail:{
    Difficulty : Hard
    Acceptance Rate : 53.01 %
    Runtime : 1 ms
    Memory Usage : 41.6 MB
    Testcase : 30 / 30 passed
    Ranking : 
        Your runtime beats 88.95 % of java submissions.
        Your memory usage beats 54.92 % of java submissions.
}
*/

class Solution {
    public int splitArray(int[] nums, int m) {
        //indentify if nums contains negative or not
        //minimize the largest sum among all subarray
        //m number of subarrays
        
        //indentify the range of search
        int left=0;
        int right=0;
        //search
        for(int j=0;j<nums.length;j++){
          left=Math.max(left,nums[j]);
            right+=nums[j];
        }
        // System.out.println("left"+left);
        // System.out.println("right"+right);
        // System.out.println("test:"+isValid(nums,2,19));
        while(left<=right){
            int mid=left+(right-left)/2;
            //System.out.println("mid"+mid);
            
            if(isValid(nums,m,mid)==true){
                //left=mid+1;
                 right=mid-1;
               
            }
            
            else{
                left=mid+1;
            }
            
        }
        // System.out.println("left"+left);
        // System.out.println("right"+right);
        //if(left>right)
        return left;
        //return 0;
    }
    
    
    public boolean isValid(int[] nums, int m,int mid){
        int temp=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(temp<mid){
                temp+=nums[i];
                //continue;
            }
            if(temp>=mid){
                // System.out.println(i);
                // System.out.println(temp);
                if(temp==mid){
                      count++;
                    temp=0;
                }
                else if(temp>mid){
                    if(temp-nums[i]<mid){
                        count++;
                        temp=nums[i];
                    } 
                }
              
            }
        }
        //System.out.println("count"+count);
        if(temp!=0&&count>m-1){return false;}
        if(temp<=mid&&count<=m-1)
        {count++;}
        if(count<=m) return true;
        return false;
    }
}