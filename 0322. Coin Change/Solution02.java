/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 41.29 %
    Runtime : 65 ms
    Memory Usage : 57.8 MB
    Testcase : 189 / 189 passed
    Ranking : 
        Your runtime beats 18.91 % of java submissions.
        Your memory usage beats 14.85 % of java submissions.
}
*/

class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount <= 0) {
            return 0;
        }
        // List<Integer> coins2 = new ArrayList<>();
        // for(int c:coins){
        //     if(c>amount){
        //         continue;
        //     }else{
        //         coins2.add(c);
        //     }
        // }
        
        

        //Arrays.sort(coins);

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(amount);

        boolean[] visited = new boolean[amount + 1];
        visited[amount] = true;

        int step = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Integer cur = queue.poll();
                for (int x : coins) {
                    int target = cur - x;
                    //System.out.println(target);
                    if (target == 0) {
                        return step;
                    }
                   
                    if (target>=0&&!visited[target]) {
                        //System.out.println(target);
                        visited[target] = true;
                        queue.offer(target);
                    }
                }
            }

            step++;
        }

        return -1;   
    }
}
