class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int left = 0;
       int window = 0;
       int ans = Integer.MAX_VALUE;
       for(int right = 0; right<nums.length ; right++){
        window += nums[right];
        while( window >= target){
            ans = Math.min(ans, right - left + 1);
            window -= nums[left++];
        }}
        if(ans == Integer.MAX_VALUE){
            return 0;
        }
        return ans;
     
     
      }
    }
