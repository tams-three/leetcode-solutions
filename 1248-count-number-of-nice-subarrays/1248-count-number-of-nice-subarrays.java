class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int prefixsum = 0;
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            prefixsum += nums[i] % 2;
            count += map.getOrDefault(prefixsum - k , 0);
            map.put(prefixsum , map.getOrDefault(prefixsum,0)+1);
        }
        return count;
    }
}