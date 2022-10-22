/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 70.18 %
    Runtime : 4 ms
    Memory Usage : 44.2 MB
    Testcase : 55 / 55 passed
    Ranking : 
        Your runtime beats 83.33 % of java submissions.
        Your memory usage beats 28.26 % of java submissions.
}
*/

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //use a set as an naive solution
        // Arrays.sort(nums1);
        // Arrays.sort(nums2);
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            if(set.add(nums1[i]));
            
        }
        
        //List<Integer> answer = new ArrayList<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                set2.add(nums2[i]);
            }
        }
        
        int[] final_answer = new int[set2.size()];
        int counter =0;
        for(int key:set2){
            final_answer[counter]=key;
            counter++;
        }
        return final_answer;
    }
}