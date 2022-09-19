/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 49.76 %
    Runtime : 162 ms
    Memory Usage : 84.4 MB
    Testcase : 48 / 48 passed
    Ranking : 
        Your runtime beats 54.67 % of java submissions.
        Your memory usage beats 56.71 % of java submissions.
}
*/

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
       
        //ArrayDeque<int[]> stack = new ArrayDeque<>();
        
        double[][] posvspeed = new double[position.length][2];
        
        for(int i=0;i<position.length;i++){
            posvspeed[i][0]=position[i];
            posvspeed[i][1]=(double)(target - position[i]) / speed[i];
            //System.out.println((target - position[i]) / speed[i]);
                
        }
        //System.out.println(posvspeed[1][1]);
        //Arrays.sort(posvspeed, (a, b) -> a[0]-b[0]);
        //Arrays.sort(posvspeed, (a,b)->a[0]-b[0]);
        Arrays.sort(posvspeed, (a, b) -> Double.compare(a[0], b[0]));
        
        
        //using a stack
        ArrayDeque<double[]> stack = new ArrayDeque<>();
        for(int j=posvspeed.length-1;j>=0;j--){
            //System.out.println("CURR pos"+posvspeed[j][0]);
            //System.out.println("stacktoppos"+stack.peekLast()[0]);
            if(!stack.isEmpty()&&posvspeed[j][0]<stack.peekLast()[0]&&posvspeed[j][1]<=stack.peekLast()[1]){
                //System.out.println("hi");
               continue; 
            }
            
            stack.addLast(posvspeed[j]);
        }
        return stack.size();
        
        
        
        
        //time that will take each car to complete or how many hours its away
        //the distance its away from the end
        //we need to sort it 
        
        //target-position/speed = time away from the end
        //10:1
        //8:1
        //0:12
        //5:7
        //3:3
        
        //10:1
        //8:1
        //5:7
        //3:3
        //0:12
        
        //time same or smaller, then they are one group
        //and also starting position smaller
        
        //                      c
        //          a
        //                  b
        //                  
        
    }
}