/*
Submission Detail:{
    Difficulty : Hard
    Acceptance Rate : 43.15 %
    Runtime : 512 ms
    Memory Usage : 87.3 MB
    Testcase : 52 / 52 passed
    Ranking : 
        Your memory usage beats 24.81 % of java submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class Solution {
    
    //boolean flag = false;
    Map<String,Boolean> cache = new HashMap<>();
    Set<Integer> validSet = new HashSet<>();
    
    public boolean canCross(int[] stones) {
     // [0,1,3,5,6,8,12,17]
     //  f 1 2 2   3 4 5
        for(int i =0; i<stones.length;i++){
            validSet.add(stones[i]);
        }
        //dfs(1,stones[stones.length-1],1)||
        return dfs(1,stones[stones.length-1],1);
        //return flag;
    
        
    //termination condition
    //occurs at when frog cant get anywhere except for target stones[length-1]
    
    }
    
    private boolean dfs(int pos, int target, int lastjump){
        
        String key = pos+"_"+lastjump;
        //termination condition
        
        if(pos==target){
            cache.put(key,true);
            return cache.get(key);
        }
        if((pos+lastjump-1)>target){
            cache.put(key,false);
            return cache.get(key);
        }
        if(!validSet.contains(pos)){
            cache.put(key,false);
            return cache.get(key);
        }
        if(cache.containsKey(key)){
            return cache.get(key);
        }
        boolean optOne = false;
        boolean optTwo = false;
        boolean optThree = false; 
        if(validSet.contains(pos+lastjump-1)&&lastjump-1!=0){
            optOne = dfs(pos+lastjump-1,target,lastjump-1);
        }
        if(validSet.contains(pos+lastjump)&&lastjump!=0){
            optTwo = dfs(pos+lastjump,target,lastjump);
        }
        
        if(validSet.contains(pos+lastjump+1)&&lastjump+1!=0){

            
            optThree = dfs(pos+lastjump+1,target,lastjump+1);
        }
       
        cache.put(key,optOne||optTwo||optThree);
        return cache.get(key);
    }
    
    
    
}