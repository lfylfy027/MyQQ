/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    vector<vector<int> > paths;
    vector<int> path;
    void getpath(TreeNode* root, int sum){
        if(root == NULL)
            return;
        path.push_back(root -> val);
        if(sum == root -> val && root -> left == NULL && root ->right == NULL){
            paths.push_back(path);
            path.pop_back();
            return;
        }
        getpath(root -> left,sum - root->val);
        getpath(root -> right,sum - root->val);
        path.pop_back();
    }
    vector<vector<int>> pathSum(TreeNode* root, int sum) {
        getpath(root,sum);
        return paths;
    }
};