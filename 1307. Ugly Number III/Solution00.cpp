/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 28.54 %
    Runtime : 0 ms
    Memory Usage : 5.9 MB
    Testcase : 53 / 53 passed
    Ranking : 
        Your runtime beats 100.00 % of cpp submissions.
        Your memory usage beats 68.27 % of cpp submissions.
}
*/

class Solution {
public:
  int nthUglyNumber(int n, long a, long b, long c) {    
    long l = 1;
    long r = INT_MAX;
    long ab = lcm(a, b);
    long ac = lcm(a, c);
    long bc = lcm(b, c);
    long abc = lcm(a, bc);
    while (l <= r) {
      long m = l + (r - l) / 2;
      long k = m / a + m / b + m / c - m / ab - m / ac - m / bc + m / abc;      
      if (k >= n) r = m-1;
      else l = m + 1;
    }
    return l;
  }
};