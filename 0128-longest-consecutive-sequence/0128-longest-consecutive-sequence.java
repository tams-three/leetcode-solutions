class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums){
            set.add(x);
        }
        int ans =0;
        for(int x : set){
            if(!set.contains(x-1)){
                int count =0 ;
                while(set.contains(x++)){
                    count++;
                }
                ans = Math.max(ans,count);
            }
        }
        return ans;
    }
}