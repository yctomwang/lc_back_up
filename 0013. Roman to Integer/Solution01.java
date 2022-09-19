/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 58.29 %
    Runtime : 12 ms
    Memory Usage : 46.6 MB
    Testcase : 3999 / 3999 passed
    Ranking : 
        Your runtime beats 38.73 % of java submissions.
        Your memory usage beats 37.35 % of java submissions.
}
*/

class Solution {
    public int romanToInt(String s) {
    int answer=0;
    Map<Character,Integer> map = new HashMap<>();
    //populate the map with roman char to number 
    map.put('I',1);
    map.put('V',5);
    map.put('X',10);
    map.put('L',50);
    map.put('C',100);
    map.put('D',500);
    map.put('M',1000);
        
        
    //27-> XXVII 10,10,5,2,2
    //smaller value can only be placed before larger
    //in the case of 90,40,900,400,9,4
    //XI is 5 and 1
    //IX is 5-1
    for(int i=0;i<s.length();i++){
        if(i!=0&&map.get(s.charAt(i-1))<map.get(s.charAt(i))){
            
            answer-=2*map.get(s.charAt(i-1));
            
        }
        char curr = s.charAt(i);
        answer+=map.get(curr);
    }
    
        
    return answer;
    
    }
}