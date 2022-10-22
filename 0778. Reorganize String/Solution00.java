/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 52.73 %
    Runtime : 7 ms
    Memory Usage : 42.3 MB
    Testcase : 70 / 70 passed
    Ranking : 
        Your runtime beats 53.24 % of java submissions.
        Your memory usage beats 49.40 % of java submissions.
}
*/

class Solution {
    public String reorganizeString(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()) map.put(c,map.getOrDefault(c,0)+1);
        //pq with custom comparator
        PriorityQueue<Point> pq = new PriorityQueue<>((a,b)->b.num-a.num);
        for(char c:map.keySet()) pq.add(new Point(c, map.get(c)));
        StringBuilder res = new StringBuilder();
        while(pq.size()>=2){
            Point p1 = pq.poll();
            Point p2 =pq.poll();
            res.append(p1.c).append(p2.c);
            if(--p1.num>0) pq.add(p1);
            if(--p2.num>0) pq.add(p2);
            
        }
        
        if(pq.size()>0) res.append(pq.poll().c);
        return res.length()==s.length()?res.toString():"";
        
    }
    
    
}



//Wrapper class 
class Point{
    char c;
    int num;
    Point(char c, int num){
        this.c=c;
        this.num = num;
    }
}