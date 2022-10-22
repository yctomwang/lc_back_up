/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 53.35 %
    Runtime : 168 ms
    Memory Usage : 180.6 MB
    Testcase : 24 / 24 passed
    Ranking : 
        Your runtime beats 19.25 % of java submissions.
        Your memory usage beats 00.00 % of submissions.
}
*/

class LUPrefix {
    //List<Integer> numbers = new ArrayList<>();
    int maximum;
    Set<Integer> set;
    int lastmissing=2;
    int longest=1;
    int last=1;
    public LUPrefix(int n) {
        set =new HashSet<Integer>();
        maximum=n;
    }
    
    public void upload(int video) {
        set.add(video);
    }
    
    public int longest() {
        // int longest=1;
        //int last=1;
        //pre check
        if(!set.contains(1)) return 0;
        
        for(int i=lastmissing; i<maximum+1;i++){
            if(set.contains(i)&&i-last==1){
                longest++;
                last=i;
            } else{
                
                lastmissing=i;
                break;
            }
        }
        return longest;
    }
}

/**
 * Your LUPrefix object will be instantiated and called as such:
 * LUPrefix obj = new LUPrefix(n);
 * obj.upload(video);
 * int param_2 = obj.longest();
 */