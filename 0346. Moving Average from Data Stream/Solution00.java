/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 76.94 %
    Runtime : 62 ms
    Memory Usage : 61.7 MB
    Testcase : 11 / 11 passed
    Ranking : 
        Your runtime beats 79.09 % of java submissions.
        Your memory usage beats 58.40 % of java submissions.
}
*/

class MovingAverage {
  int size, windowSum = 0, count = 0;
  Deque queue = new ArrayDeque<Integer>();

  public MovingAverage(int size) {
    this.size = size;
  }

  public double next(int val) {
    ++count;
    // calculate the new sum by shifting the window
    queue.add(val);
     int head;
    if(count>size){
        head=(int)queue.poll();
    }else{
      head=0;
    }
    

    windowSum = windowSum - head + val;

    return windowSum * 1.0 / Math.min(size, count);
  }
}