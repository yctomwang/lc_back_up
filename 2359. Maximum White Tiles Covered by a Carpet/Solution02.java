/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 32.17 %
    Runtime : 97 ms
    Memory Usage : 85.5 MB
    Testcase : 51 / 51 passed
    Ranking : 
        Your runtime beats 43.60 % of java submissions.
        Your memory usage beats 36.03 % of java submissions.
}
*/

class Solution {
    public int maximumWhiteTiles(int[][] tiles, int carpetLen) {
                
        
        Arrays.sort(tiles, (a,b)->{
            return a[0]==b[0] ? a[1]-b[1]:a[0]-b[0];
        });
        // for(int i=0;i<tiles.length;i++){
        //     System.out.print(tiles[i][0]);
        //     System.out.println(" "+tiles[i][1]);
        // }
        int n = tiles.length;
        int[] preSum = new int[n];
        
        for(int i=0;i<n;i++){
            preSum[i]=(i==0?0:preSum[i-1])+(tiles[i][1]-tiles[i][0]+1);
        }
        int j=0;
        int answer=0;
        for(int i=0;i<n;i++){
            
            while(j<n&&tiles[i][0]+carpetLen-1>=tiles[j][1]){
                j++;
            }
            //System.out.println(j);
            if(j==0&&i==0){
                if(carpetLen<tiles[0][1]){
                    return carpetLen;
                }
            }
            
            
            
            int len =preSum[j-1]-(i==0?0:preSum[i-1]);
            if(j<n){
                 len+=Math.max(0,((tiles[i][0]+carpetLen-1)-tiles[j][0]+1));
            }
           
            answer=Math.max(answer,len);
        }
        
        return answer;
    }
    
   
}