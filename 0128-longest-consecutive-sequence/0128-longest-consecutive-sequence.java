class Solution {
    public int longestConsecutive(int[] nums) {
      Set<Integer> set = new HashSet<>();
      for(int i =0 ; i<nums.length ; i++){
        set.add(nums[i]);
      }
      int longest = 0;
      for(int i:set){
        if(!set.contains(i-1)){
            int current = i;
            int length = 1;
            while(set.contains(current + 1)){
                length++;
                current++;
            }
            longest = Math.max(longest, length);
        }
      }
      return longest;
    }
}