/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 85.68 %
    Runtime : 45 ms
    Memory Usage : 103.3 MB
    Testcase : 75 / 75 passed
    Ranking : 
        Your runtime beats 62.55 % of java submissions.
        Your memory usage beats 23.77 % of java submissions.
}
*/

class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int paperTime=0;
        int glassTime=0;
        int metalTime=0;
        
        int lastPaper=0;
        int lastGlass=0;
        int lastMetal=0;
        
        for(int i=0;i<garbage.length;i++){
            int glasscount=0;
            int metalcount=0;
            int papercount=0;
            String curr= garbage[i];
            for(int j=0;j<curr.length();j++){
                char currChar= curr.charAt(j);
                if(currChar=='G'){
                    glasscount++;
                }else if(currChar=='P'){
                    papercount++;
                }else if(currChar=='M'){
                    metalcount++;
                }
            }
            // System.out.println("g"+glasscount);
            // System.out.println("p"+papercount);
            // System.out.println("m"+metalcount);
            if(glasscount!=0){
                lastGlass=i;
                glassTime+=glasscount;
            }
            if(papercount!=0){
                lastPaper=i;
                paperTime+=papercount;
            }
            if(metalcount!=0){
                lastMetal=i;
                metalTime+=metalcount;
            }
        }
        // System.out.println("paper"+lastPaper);
        // System.out.println("glasss"+lastGlass);
        // System.out.println("metal"+lastMetal);
        
        for(int a=0;a<lastPaper;a++){
            paperTime+=travel[a];
        }
        for(int a=0;a<lastGlass;a++){
            glassTime+=travel[a];
        }
         for(int a=0;a<lastMetal;a++){
            metalTime+=travel[a];
        }
        return paperTime+glassTime+metalTime;
        
        
        
    }
}