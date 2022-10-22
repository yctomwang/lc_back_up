/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 70.18 %
    Runtime : 2 ms
    Memory Usage : 42.6 MB
    Testcase : 55 / 55 passed
    Ranking : 
        Your runtime beats 98.62 % of java submissions.
        Your memory usage beats 87.17 % of java submissions.
}
*/

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
         Arrays.sort(nums1);
         Arrays.sort(nums2);
        // 1 2 2 3 7 9 9
        // 2 2 3 4 9
        // asking for o(1) space
        
        //pointer for nums1
        int i =0;
        //pointer for nums2
        int j = 0;
        //k means how many in nums2 we will be keeping
        int k =0;
        while(i<nums1.length&&j<nums2.length){
            
            while(i!=0&&i<nums1.length&&nums1[i]==nums1[i-1]){
                i++;
            }

            while(j!=0&&j<nums2.length&&nums2[j]==nums2[j-1]){
                j++;
            }
            if(i<nums1.length&&j<nums2.length){
                if(nums1[i]<nums2[j]){
                i++;
            } else if(nums1[i]==nums2[j]){
                nums2[k]= nums1[i];
                k++;
                i++;
                j++;
            } else if(nums1[i]>nums2[j]){
                j++;
            }
            }
            
        }
        
        return Arrays.copyOf(nums2,k);
        
    }
}