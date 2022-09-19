/*
Submission Detail:{
    Difficulty : Easy
    Acceptance Rate : 70.58 %
    Runtime : 16 ms
    Memory Usage : 10.3 MB
    Testcase : 106 / 106 passed
    Ranking : 
        Your runtime beats 94.78 % of cpp submissions.
        Your memory usage beats 83.07 % of cpp submissions.
}
*/

class Solution {
public:
    string twoPointers(string &S) {
        int write_idx = 0, curr_idx = 0;
        
        while(curr_idx < S.size()) {
            // Last added char is a duplicate of current, so ignore both
            if(write_idx > 0 && S[write_idx-1] == S[curr_idx]) 
                write_idx -= 1;
            else
                S[write_idx++] = S[curr_idx];
            ++curr_idx;
        }
        
        return S.substr(0, write_idx);
    }
    
    string removeDuplicates(string S) {
        // return stackSol(S);
        return twoPointers(S);
    }
};
