class Solution {
public:
    int maxSubArray(vector<int>& nums) {
      int maxsum = nums[0];
      int sum = nums[0];
      for(int i = 1;i < nums.size();i++){
          if(sum < 0 && nums[i] >= sum){
              sum = nums[i];
          }
          else{
              sum += nums[i];
          }
          maxsum = max(maxsum,sum);
      }
        return maxsum;
    }
};