/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 51.79 %
    Runtime : 11 ms
    Memory Usage : 48.2 MB
    Testcase : 58 / 58 passed
    Ranking : 
        Your runtime beats 33.76 % of java submissions.
        Your memory usage beats 40.61 % of java submissions.
}
*/

class MyCircularQueue {
    int size=0;
    int current=0;
    LinkedList<Integer> list;
  
    
    public MyCircularQueue(int k) {
        size=k;
        list = new LinkedList<Integer>();
    }
    
    public boolean enQueue(int value) {
        if(current==size) return false;
        else{
            current++;
            list.add(value);
            return true;
        }
    }
    
    public boolean deQueue() {
        if(current!=0){
            list.remove();
            current--;
            return true;
        }else{
            return false;
        }
        //list.remove();
    }
    
    public int Front() {
        if(current==0) return -1;
        return list.peekFirst();
    }
    
    public int Rear() {
        if(current==0)return -1;
        return list.peekLast();
    }
    
    public boolean isEmpty() {
        if(current==0) return true;
        else return false;
    }
    
    public boolean isFull() {
        if(current==size)return true;
        else return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */