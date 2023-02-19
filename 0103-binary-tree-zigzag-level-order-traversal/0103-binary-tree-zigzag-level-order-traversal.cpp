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
    vector<vector<int>> zigzagLevelOrder(TreeNode* root) {
        if(!root) return {};
        queue<TreeNode*> q;
        q.push(root);
        int lvlCnt = 0;
        vector<vector<int>> ans;
        while(!q.empty()) {
            int n = q.size();
            vector<int> lvlOrder;
            while(n--) {
                TreeNode *cur = q.front();
                lvlOrder.push_back(cur->val);
                q.pop();
                if(cur->left) q.push(cur->left);
                if(cur->right) q.push(cur->right);
            }
            if(lvlCnt&1) reverse(lvlOrder.begin(), lvlOrder.end());
            ans.push_back(lvlOrder);
            ++lvlCnt;
        }
        
        return ans;
    }
};