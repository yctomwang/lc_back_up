/*
Submission Detail:{
    Difficulty : Medium
    Acceptance Rate : 85.68 %
    Runtime : 3 ms
    Memory Usage : 12.1 MB
    Testcase : 138 / 138 passed
    Ranking : 
        Your runtime beats 99.19 % of cpp submissions.
        Your memory usage beats 41.42 % of cpp submissions.
}
*/

/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    array<int, 3> dfs(TreeNode* n) {
    if (n == nullptr)
        return {0, 0, 0};
    auto p1 = dfs(n->left), p2 = dfs(n->right);
    int sum = p1[0] + p2[0] + n->val, count = 1 + p1[1] + p2[1];
    return {sum, count, p1[2] + p2[2] + (n->val == sum / count)};
}
int averageOfSubtree(TreeNode* root) {
    return dfs(root)[2];
}
};