/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 58.61 %
    Runtime : 23 ms
    Memory Usage : 42.3 MB
    Testcase : 35 / 35 passed
    Ranking : 
        Your runtime beats 48.46 % of java submissions.
        Your memory usage beats 89.14 % of java submissions.
}
*/

class Solution {
    public String rankTeams(String[] votes) {
        //Use a HashMap to count for votes right?
        //A:1 b:2  c:3 
        //int[]'s 0 index will store the number of first place
        //int[]'s 1 index will store the number of second place etc...
        HashMap<Character, int[]> mapOfVotes = new HashMap<>();
        
        //votes contains all the votes ABC
        //loop through each voter's vote
        for(int i=0;i<votes.length;i++){
            for(int j=0; j<votes[i].length();j++){
                char curr = votes[i].charAt(j);
                
                mapOfVotes.put(curr,mapOfVotes.getOrDefault(curr, new int[26]));
                int[] c =mapOfVotes.get(curr);
                c[j]++;
                mapOfVotes.put(curr,c);
                //mapOfVotes.put(curr,mapOfVotes.get(curr)[j]++);
            }
        }
        //we also somehow gotta store
        
        //Loopthrough
        // sort descending
        List<Map.Entry<Character, int[]>> list = new ArrayList<>(mapOfVotes.entrySet());
        
        Collections.sort(list, (a,b) -> {
            for(int i = 0 ; i < 26 ;i++) {
                if (b.getValue()[i] != a.getValue()[i]) {
                    return b.getValue()[i] - a.getValue()[i];
                }
            }
            return a.getKey().compareTo(b.getKey());
        });
        
        StringBuilder result = new StringBuilder(list.size());
        for(int i = 0 ; i < list.size() ;i++) {
            result.append(list.get(i).getKey());
        }
        
        return result.toString();
        
        //return "";
    }
}