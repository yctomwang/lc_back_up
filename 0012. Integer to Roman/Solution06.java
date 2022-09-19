/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 60.34 %
    Runtime : 401 ms
    Memory Usage : 57.1 MB
    Testcase : 3999 / 3999 passed
    Ranking : 
        Your runtime beats 00.00 % of submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    public String intToRoman(int num) {
        StringBuilder answer = new StringBuilder();
        //90
        //40
        //9
        //4
        //900
        //400 are all special cases
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(1,"I");
        map.put(4,"IV");
        map.put(5,"V");
        map.put(9,"IX");
        map.put(10,"X");
        map.put(40,"XL");
        map.put(50,"L");
        map.put(90,"XC");
        map.put(100,"C");
        map.put(400,"CD");
        map.put(500,"D");
        map.put(900,"CM");
        map.put(1000,"M");
        List<Integer> list= new ArrayList<>(map.keySet());
        Collections.reverse(list);
        
        //System.out.println(list);
        while(num!=0){
            
           for(int curr: list){
               System.out.println(curr);
               if(curr<=num){
                   num-=curr;
                   answer.append(map.get(curr));
                   break;
               }
           }
        }
        
        //we need to try 800
        //800=biggest values that is not uptp 800 aka 500
        //800-500 -> 300
        //300 biggest value
        return answer.toString();
        
    }
}