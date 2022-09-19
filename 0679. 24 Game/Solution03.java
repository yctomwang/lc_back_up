/*
Submission Detail:{
    Difficulty : Hard
    Acceptance Rate : 49.08 %
    Runtime : 34 ms
    Memory Usage : 53.1 MB
    Testcase : 71 / 71 passed
    Ranking : 
        Your runtime beats 16.28 % of java submissions.
        Your memory usage beats 25.40 % of java submissions.
}
*/

class Solution {
    public final double difference = 0.0000001;
    public boolean judgePoint24(int[] cards) {
        List<Double> cards2 = new ArrayList<>();
        
        //double [] cards2 = new double[cards.length];
        for(int i=0;i<cards.length;i++){
          cards2.add((double) cards[i]);
        }
        return dfs(cards2);
        //return true;
    
    }
    
    public double calculate(double first, double second, int oper){
        switch (oper) {
            case 0:
            return first+second;
            case 1:
            return first-second;
            case 2:
            return first*second;
            case 3:
            return first/second;
        }
        return first+second;
    }
    public boolean dfs(List<Double> cards2){
        //if list length is 1, we check to see if its 24
        //termination condition
        if(cards2.size()==1){
            if(Math.abs((cards2.get(0)-24.0))<difference){
                //System.out.println(cards2.get(0));
                return true;
            }
            return false;
        }
        
        //otherwise, pick 2 random numbers, do either one of +-*/ 
        //then thats the solution
        
        
        for(int i=0; i<cards2.size();i++){
            for(int j=0;j<cards2.size();j++) if(i!=j){
                for(int cal=0;cal<4;cal++){
                    double ans = calculate(cards2.get(i),cards2.get(j),cal);
                    //the position of i and j is relative
                    List<Double> newlist = new ArrayList<>(cards2);
                    if(i<j){
                        newlist.remove(j);
                        newlist.remove(i);
                    }else{
                        newlist.remove(i);
                        newlist.remove(j);
                    }
                    newlist.add(ans);
                    if(dfs(newlist)==true){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}