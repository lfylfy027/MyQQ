class Solution {
    public int maxSubArray(int[] nums) {
        int ans=nums[0];
        int cur=0;
        for(int x:nums){
            cur=Math.max(cur+x,x);
            ans=Math.max(ans,cur);
        }
        return ans;
    }
}