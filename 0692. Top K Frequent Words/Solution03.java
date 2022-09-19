/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 55.07 %
    Runtime : 15 ms
    Memory Usage : 44.7 MB
    Testcase : 110 / 110 passed
    Ranking : 
        Your runtime beats 16.73 % of java submissions.
        Your memory usage beats 82.55 % of java submissions.
}
*/

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        List<String> answer= new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        
        for(String word:words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        //heap is smallest
        
        //map.get(a)==map.get(b)? a-b: map.get(a)-map.get(b)
        PriorityQueue<String> heap = new PriorityQueue<>((a,b)->map.get(a)==map.get(b)? b.compareTo(a): map.get(a)-map.get(b));
        
        
        for(String word: map.keySet()){
            heap.add(word);
            if(heap.size()>k){
                heap.poll();
            }
        }
        
         for(int i=0;i<k;i++){
            answer.add(heap.poll());
        }
        Collections.reverse(answer);
        return answer;
        
    }
}