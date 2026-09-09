class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1){
            return 0;
        }
        int left = 0;
        int window = 1;
        int ans = 0;
        for(int right = 0 ; right < nums.length ; right++){
            window *= nums[right];

            while(window >= k){
                window /= nums[left];
                left++;
            }
            ans += right - left + 1;
        }
        return ans;
    }
}