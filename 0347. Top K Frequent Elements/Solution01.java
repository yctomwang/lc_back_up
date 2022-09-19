/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 64.86 %
    Runtime : 25 ms
    Memory Usage : 50.9 MB
    Testcase : 21 / 21 passed
    Ranking : 
        Your runtime beats 32.06 % of java submissions.
        Your memory usage beats 31.38 % of java submissions.
}
*/

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int num : nums){
            map.put(num,(map.getOrDefault(num,0)+1));
        }
        //heapæ¯æå°å 
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
        
        for(int key: map.keySet()){
            heap.add(key);
            
            if(heap.size()>k){
                heap.poll();
            }
        }
        
        
        //PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->Integer.compare(map.get(a), map.get(b)));
//         for(int i=0;i<k;i++){
            
//         }
        int[] answer  = new int[k];
        //int[] y = heap.toArray(new int[0]);
        
        for(int i=0;i<k;i++){
            answer[i]=heap.poll();
        }
        return answer;
        
    }
}