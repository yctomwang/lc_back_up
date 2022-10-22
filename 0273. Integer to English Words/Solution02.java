/*
Submission Detail:{
    Difficulty : Hard
    Acceptance Rate : 29.88 %
    Runtime : 17 ms
    Memory Usage : 42.4 MB
    Testcase : 601 / 601 passed
    Ranking : 
        Your runtime beats 42.45 % of java submissions.
        Your memory usage beats 68.45 % of java submissions.
}
*/

class Solution {
        private final String[] belowTen = new String[]{"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        private final String[] belowTwenty = new String[]{"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        private final String[] belowHundred = new String[] {"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    public String numberToWords(int num) {
        if(num==0) return "Zero";
        
        
        
        
        return helper(num);
        
        
    }
    
    
    private String helper(int num){
        String  res = new String();
        
        if(num<10){
            res = belowTen[num];
        } else if(num<20){
            res = belowTwenty[num-10];
        } else if(num<100){
            res =belowHundred[num/10]+" "+ helper(num%10);
        } else if(num<1000){
            res = helper(num/100)+ " Hundred " + helper(num%100);
        }else if(num<1000000){
            res = helper(num/1000)+ " Thousand " + helper(num%1000);
        }else if(num<1000000000){
            res = helper(num/1000000)+ " Million " + helper(num%1000000);
        }else{

            res = helper(num/1000000000)+ " Billion " + helper(num%1000000000);
        }
        
        
        return res.trim();
    }
    
    
}