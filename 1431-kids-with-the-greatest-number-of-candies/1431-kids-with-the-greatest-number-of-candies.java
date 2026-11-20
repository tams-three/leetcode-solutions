class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = 0;
        for(int x:candies){
            max= Math.max(max,x);
        }
        for(int ca:candies){
            list.add(ca + extraCandies>=max);
        }
        return list;
    }
}