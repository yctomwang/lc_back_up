/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 59.11 %
    Runtime : 12 ms
    Memory Usage : 48.2 MB
    Testcase : 22 / 22 passed
    Ranking : 
        Your runtime beats 75.48 % of java submissions.
        Your memory usage beats 49.05 % of java submissions.
}
*/

class Solution {
    public int longestRepeatingSubstring(String s) {
     //
    int left=0;
    int right=s.length()-1;
    System.out.println(helper(4,s));
    while(left<=right){
        int mid=left+(right-left)/2;
        //answer is smaller than or equals to
        if(helper(mid,s)==true){
            left=mid+1;
        }
        else{
            right=mid-1;
        }
    }
    return right;
        
        
    
    }
    //1(t) 2(t) 3(f) 4(f)
    //we need to find the last good version
    //so if 2 is the last good version, we aiming for 2.5
    //return if its a reaping substring or not
    public boolean helper(int len, String s){
        HashSet<String> seen = new HashSet<>();
        for(int i=0; i<(s.length()-len+1);i++){
            String sub= s.substring(i,i+len);
            if(seen.contains(sub)) return true;
            else seen.add(sub);
        }
        return false;
    }
}