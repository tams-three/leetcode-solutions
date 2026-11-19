class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
      HashMap <Integer, Integer> map = new HashMap<>();
      map.put(0,1);
      int res = 0;
      int curr = 0;
      for(int i:nums){
        curr += i%2;
        res+= map.getOrDefault(curr-k,0);
        map.put(curr, map.getOrDefault(curr,0)+1);
      }
      return res;
    }
}