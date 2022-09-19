/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 39.13 %
    Runtime : 3 ms
    Memory Usage : 42.1 MB
    Testcase : 48 / 48 passed
    Ranking : 
        Your runtime beats 10.00 % of java submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    public int countDaysTogether(String aa, String al, String ab, String lb) {
        Map<Integer,Integer> date = new HashMap<>();
        //[31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
        date.put(1,31);
        date.put(2,28);
        date.put(3,31);
        date.put(4,30);
        date.put(5,31);
        date.put(6,30);
        date.put(7,31);
        date.put(8,31);
        date.put(9,30);
        date.put(10,31);
        date.put(11,30);
        date.put(12,31);
        String[] AA = aa.split("-", 2);
        String[] AL = al.split("-", 2);
        String[] AB = ab.split("-", 2);
        String[] LB = lb.split("-",2);
        int aliceStart=0;
        int aliceEnd=0;
        int bobStart=0;
        int bobEnd =0;
        for(int b: date.keySet()){
            if(b<Integer.parseInt(AA[0])){
                aliceStart+=date.get(b);
            }
            
            if(b<Integer.parseInt(AL[0])){
                aliceEnd+=date.get(b);
            }
            if(b<Integer.parseInt(AB[0])){
                bobStart+=date.get(b);
            }
            if(b<Integer.parseInt(LB[0])){
                bobEnd+=date.get(b);
            }
        }
        //System.out.println(AA[0]);
        int number1 = Integer.parseInt(AA[1]);
        int number2 = Integer.parseInt(AL[1]);
        int number3 = Integer.parseInt(AB[1]);
        int number4 = Integer.parseInt(LB[1]);
        
        
        aliceStart+=number1;
         aliceEnd+=number2;
         bobStart+=number3;
         bobEnd+=number4;
        
        // System.out.println(aliceStart);
        // System.out.println(aliceEnd);
        // System.out.println(bobStart);
        // System.out.println(bobEnd);
        if(aliceEnd<bobStart)return 0;
        if(bobEnd<aliceStart)return 0;
            
        int start=Math.max(aliceStart,bobStart);
        int end = Math.min(aliceEnd, bobEnd);
        // System.out.println("start"+start);
        // System.out.println("end"+end);
        return (end-start+1);
        
    }
}