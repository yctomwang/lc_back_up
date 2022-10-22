/*
Submission Detail:{
    Difficulty : Hard
    Acceptance Rate : 51.08 %
    Runtime : 329 ms
    Memory Usage : 125.8 MB
    Testcase : 21 / 21 passed
    Ranking : 
        Your runtime beats 13.18 % of java submissions.
        Your memory usage beats 25.58 % of java submissions.
}
*/

class MedianFinder {
    //minheap's top is minimum
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    //maxheap's top is maximum
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        maxHeap.add(num);
        minHeap.add(maxHeap.remove());
        //balacing heap
        if(minHeap.size()>maxHeap.size()){
            maxHeap.add(minHeap.remove());
        }
    }
    
    public double findMedian() {
        if(maxHeap.size()==minHeap.size()){
            return (maxHeap.peek()+minHeap.peek())/2.0;
        }
        else{
            return(double) maxHeap.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */