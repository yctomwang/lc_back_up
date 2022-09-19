/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 69.85 %
    Runtime : 87 ms
    Memory Usage : 84.6 MB
    Testcase : 33 / 33 passed
    Ranking : 
        Your runtime beats 61.22 % of java submissions.
        Your memory usage beats 66.72 % of java submissions.
}
*/

class Solution {
    public int minSetSize(int[] arr) {
        
        //Arrays.sort(arr);
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            int curr= arr[i];
            map.put(curr,map.getOrDefault(curr,0)+1);
        }
        //System.out.println(map.values().toArray());
        
        
        //Collections.sort(map.values());
        List<Integer> counts = new ArrayList<>(map.values());
        Collections.sort(counts);
        Collections.reverse(counts);
        
        int removed=0;
        int size=0;
        for(int count:counts){
            size+=count;
            removed++;
            if(size*2>=arr.length){
                return removed;
            }
        }
        return 0;
        
        //nlogn solution using sorting
        
        //for loop through the array
        //put everything into a map
        
        //for loop through the map
        //since we know the keyset are order,
        //go from the biggest key to smallest
    }
}