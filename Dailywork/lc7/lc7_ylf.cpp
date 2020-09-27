class Solution {
public:
    int reverse(int x) {
        bool isneg = 0;
        int newnum = 0;
        if(x == -2147483648)
            return 0;
        if(x < 0){
            x = -x;
            isneg = 1;
        }
        int cnt = 0;
        while(x > 0){
            if((long long)(x % 10 + newnum * 10l) > 2147483647){
                return 0;
            }
            newnum = x % 10 + newnum * 10;
            x /= 10;
        }
        if(isneg){
            newnum = -newnum;
        }
        return newnum;
    }
};