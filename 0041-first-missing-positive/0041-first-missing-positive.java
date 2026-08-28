class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
       int missingno = 1;
       for(int i : nums){
        if(i>0){
            if(i==missingno){
                missingno++;
            }
            if(i>missingno){
                break;
            }
        }
       }
       return missingno;
    }
}