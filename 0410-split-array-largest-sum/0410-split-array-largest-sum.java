class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;
        int ans = 0;
        for(int i = 0 ; i<nums.length ; i++){
            low = Math.max(low,nums[i]);
            high += nums[i];
        }
        while(low<=high){
            int mid = low + (high-low)/2;
            if(isItPossible(nums,mid,k)){
                ans = mid;
                high = mid-1;
        }
        else{
            low = mid +1;
        }
    }
    return ans;
    }

    public static boolean isItPossible(int nums[], int maxsum, int k){
        int subarray = 1;
        int sum = 0;
        for(int i = 0; i<nums.length ; i++){
            if(sum + nums[i]<=maxsum){
                sum += nums[i];
            }
            else{
                subarray++;
                sum = nums[i];
            }
            if(subarray>k){
                return false;
            }
        }
        return true;
    }
}