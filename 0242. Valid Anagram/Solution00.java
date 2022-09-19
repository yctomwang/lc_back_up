/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 62.60 %
    Runtime : 16 ms
    Memory Usage : 42.5 MB
    Testcase : 36 / 36 passed
    Ranking : 
        Your runtime beats 30.55 % of java submissions.
        Your memory usage beats 93.21 % of java submissions.
}
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> smap=new HashMap<>();
        int sl=s.length();
        int tl=t.length();
        if(sl!=tl){return false;}
        for(int i=0;i<sl;i++){
            smap.put(s.charAt(i),smap.getOrDefault(s.charAt(i),0)+1);
            smap.put(t.charAt(i),smap.getOrDefault(t.charAt(i),0)-1);
        }
        for(char c:smap.keySet()){
            if(smap.get(c)!=0){return false;}
        }
        
        return true;
    }
}