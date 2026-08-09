class Solution {
    public int firstMissingPositive(int[] nums) {
        int missingno= 1;
        Arrays.sort(nums);
        for(int num:nums){
            if(num>0){
                if(num == missingno){
                    missingno++;
                }
                else if(num>missingno){
                    break;
                }
            }
        }
        return missingno;
    }
}