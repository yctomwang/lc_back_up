/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 33.70 %
    Runtime : 847 ms
    Memory Usage : 67.5 MB
    Testcase : 987 / 987 passed
    Ranking : 
        Your memory usage beats 12.45 % of java submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        //stores character and how many time it appears;
        Map<Character,Integer> window = new HashMap<Character,Integer>();
        int left=0;
        int answer=0;
        for(int i=0;i<s.length();i++){
            //intaking
            char curr = s.charAt(i);
            window.put(curr,window.getOrDefault(curr,0)+1);
            // window.add(char);
            // System.out.println(curr);
            
            while(window.get(curr)>1){
                //decreasing the left pointer when we need to
                System.out.println("current:"+curr);
                System.out.println("i"+i);
                System.out.println("currentappearbefore"+window.get(curr));
            
                window.put(s.charAt(left),window.getOrDefault(s.charAt(left),0)-1);
                System.out.println("currentappearafter"+window.get(curr));
                left++;
            }
            
            answer= Math.max(answer,i-left+1);
            
            
        }
        
        return answer;
        
    }
}