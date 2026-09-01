class Solution {
    public int removeDuplicates(int[] nums) {
       Set<Integer> set = new LinkedHashSet<>();
       for(int i:nums){
        set.add(i);
       }
       int count = 0;
       for(int i:set){
        nums[count] = i;
        count++;
       }
       return count;
    }
}