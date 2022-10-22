/*
Submission Detail:{
    Difficulty : Hard
    Acceptance Rate : 66.76 %
    Runtime : 119 ms
    Memory Usage : 75.9 MB
    Testcase : 38 / 38 passed
    Ranking : 
        Your runtime beats 6.30 % of java submissions.
        Your memory usage beats 76.01 % of java submissions.
}
*/

class FreqStack {
    Map<Integer,Integer> hashmap;
    PriorityQueue<Elements> maxheap;
    int sequencenum;
    class Elements{
        int num;
        int frequency;
        int sequence;
        
        public Elements(int n,int f,int s){
            num = n;
            frequency = f;
            sequence = s;
        }
    }
    
    public FreqStack() {
        hashmap = new HashMap<>();
        maxheap = new PriorityQueue<>((a,b)-> b.frequency==a.frequency?b.sequence-a.sequence:b.frequency-a.frequency);
        sequencenum = 0;
    }
    
    public void push(int val) {
        hashmap.put(val,hashmap.getOrDefault(val,0)+1);
        maxheap.offer(new Elements(val,hashmap.get(val),sequencenum++));
    }
    
    public int pop() {
        int res = maxheap.poll().num;
        if(hashmap.get(res) > 1){
            hashmap.put(res,hashmap.get(res)-1);
        }else{
            hashmap.remove(res);
        }
        return res;
        
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */