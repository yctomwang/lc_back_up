/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 36.53 %
    Runtime : 42 ms
    Memory Usage : 43.5 MB
    Testcase : 291 / 291 passed
    Ranking : 
        Your runtime beats 35.41 % of java submissions.
        Your memory usage beats 84.78 % of java submissions.
}
*/

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> answer = new ArrayList();
        //use this inbuilt sort lol
        Arrays.sort(nums);
        for (int k = 0; k < nums.length - 3; k++) {
            if (k != 0 && nums[k] == nums[k - 1]) {
                continue;
            }
            long upper_temp_target = target - nums[k];
            for (int i = k + 1; i < nums.length - 2; i++) {
                if (i != k + 1 && nums[i] == nums[i - 1]) continue;
                
                
                long tempTarget = upper_temp_target - nums[i];
                int left = i + 1;
                int right = nums.length - 1;
                // System.out.println(k);
                //             System.out.println(i);
                //             System.out.println(left);
                //             System.out.println(right);
                while (left < right) {
                    while (left != i + 1 && left < right && nums[left] == nums[left - 1]) {
                        
                        left++;
                    }
                    
                    while (right != nums.length - 1 && left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                    if (left != right) {
                        if (nums[left] + nums[right] > tempTarget) {
                            right--;
                        } else if (nums[left] + nums[right] < tempTarget) {
                            left++;
                        } else if (nums[right] + nums[left] == tempTarget) {
                            // System.out.println(k);
                            // System.out.println(i);
                            // System.out.println(left);
                            // System.out.println(right);
                            answer.add(Arrays.asList(nums[k], nums[i], nums[left], nums[right]));
                            //break;
                            right--;
                            left++;

                        }
                    }

                }
            }

        }
        return answer;
    }
}