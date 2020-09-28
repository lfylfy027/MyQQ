class Solution {
public:
    string countAndSay(int n) {
        string strs[35];
        strs[0] = '1';
        for(int i = 1;i < 30;i++){
            string str;
            int cnt = 1;
            for(int j = 0;j < strs[i-1].length();j++){
                if(j+1 < strs[i-1].length() && strs[i-1][j] == strs[i-1][j+1]){
                    cnt++;
                }
                else{
                    str.push_back(char(cnt+48));
                    str.push_back(strs[i-1][j]);
                    cnt = 1;
                }
            }
            strs[i] = str;
        }
        return strs[n-1];
    }
};