class Solution {
    public int missingNumber(int[] nums) {
       int n=nums.length;
       int expected_sum=n*(n+1)/2;
       int actualsum=0;

       for(int i=0;i<n;i++){
        actualsum+=nums[i];
       } 
       return expected_sum-actualsum;
    }
}