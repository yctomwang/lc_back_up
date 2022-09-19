/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 60.34 %
    Runtime : 8 ms
    Memory Usage : 46.2 MB
    Testcase : 3999 / 3999 passed
    Ranking : 
        Your runtime beats 75.41 % of java submissions.
        Your memory usage beats 35.12 % of java submissions.
}
*/

class Solution {
    public String intToRoman(int num) {
        int Numbers[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String Roman[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb = new StringBuilder();
        while(num!=0){
            for(int i=0;i<Numbers.length;i++){
                if(Numbers[i]<=num){
                    sb.append(Roman[i]);
                    num-=Numbers[i];
                    break;
                }
            }
        }
        return sb.toString();
    }
}