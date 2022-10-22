/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 43.44 %
    Runtime : 30 ms
    Memory Usage : 43.1 MB
    Testcase : 61 / 61 passed
    Ranking : 
        Your runtime beats 85.23 % of java submissions.
        Your memory usage beats 93.59 % of java submissions.
}
*/

class Solution {
    public List<String> mostVisitedPattern(String[] username, int[] timestamp, String[] website) {
    //username, website and timestamp
    //wanted to sort the whole bloody thing
    //thomas a 1 a 2 a 3 a 4 a 5 a 6
    //thomas a 1 b 2 c 3 f 4 k 5 f 6
    //a b c || b c f|| c f k || f k f
    
    //a a a || a a a| a a a 
        
    //sort based on the time sort by user
        
    Map<String,List<Pair>> map = new HashMap<>();
    for(int i=0;i<username.length;i++){
         //map.getOrDefault(username[i],new ArrayList<>());
        // List<Pair> tempList = map.get(username[i]);
        // tempList.add(new Pair(timestamp[i],website[i]));
        map.computeIfAbsent(username[i],x-> new ArrayList<>()).add(new Pair(timestamp[i],website[i]));
    }
    Map<String, Integer> count = new HashMap<>();
    String currentBest = "";
    //looping through each user  
    for(String user: map.keySet()){
        Set<String> set = new HashSet<>();
        List<Pair> list = map.get(user);
        //smallest upfront
        Collections.sort(list,(a,b)->a.time- b. time);
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                for(int k = j+1;k<list.size();k++){
                    String pattern = list.get(i).website+" "+ list.get(j).website+" "+list.get(k).website;
                    if(set.add(pattern)){
                        count.put(pattern,count.getOrDefault(pattern,0)+1);  
                    }
                    if(currentBest.equals("")||count.get(currentBest)<count.get(pattern)||(count.get(pattern)==count.get(currentBest)&&pattern.compareTo(currentBest)<0)){
                        currentBest = pattern;
                    }
                }
            }
        }
    }
        
    return Arrays.asList(currentBest.split(" "));
    
    
    }
    
    
}

class Pair{
    int time;
    String website;
    public Pair(int time, String website){
        this.time = time;
        this.website = website;
    }
}