class Solution {
    public int subarraySum(int[] nums, int k) {
     HashMap<Integer, Integer> map = new HashMap<>();
     map.put(0,1);
     int res = 0;
     int prefixsum =0 ;
     for(int i:nums){
        prefixsum += i;
        if(map.containsKey(prefixsum - k)){
            res += map.get(prefixsum - k);
        }
        map.put(prefixsum, map.getOrDefault(prefixsum,0)+1);
     }
     return res;
    }
}