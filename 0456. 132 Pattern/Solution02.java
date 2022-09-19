/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 32.42 %
    Runtime : 881 ms
    Memory Usage : 95.3 MB
    Testcase : 102 / 102 passed
    Ranking : 
        Your runtime beats 00.00 % of submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    public boolean find132pattern(int[] nums) {
        int[] leftMin = new int[nums.length];
        leftMin[0]=Integer.MAX_VALUE;
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(int j=1;j<nums.length;j++){
            leftMin[j]=Math.min(leftMin[j-1],nums[j-1]);
        }
        
        System.out.println(leftMin.toString());
        for(int c =0;c<leftMin.length;c++){
            System.out.println(leftMin[c]);
        }
        
        for(int i =nums.length-1;i>=0;i--){
            //maintain montonic
            //loop though as we go
            int compare= Integer.MAX_VALUE;
            while(!stack.isEmpty()&&stack.peekLast()<nums[i]){
                compare =stack.removeLast();
            }
            // System.out.println("compare"+compare);
            // System.out.println("num[i]"+nums[i]);
            // System.out.println("leftmin"+leftMin[i]);
            
            if(compare<nums[i]&&compare>leftMin[i]){return true;}
            
            stack.addLast(nums[i]);
            
            
        }
        
        
        
        
        return false;
    }
}