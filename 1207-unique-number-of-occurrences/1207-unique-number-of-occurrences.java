class Solution {
    public boolean uniqueOccurrences(int[] arr) {
       HashMap<Integer, Integer> map = new HashMap<>();
       for(int val:arr){
        if(map.containsKey(val)){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        else{
            map.put(val,1);
        }
       } 
       HashSet<Integer> set = new HashSet<>();
       for(int x : map.values()){
        if(set.contains(x)){
            return false;
        }
        else{
            set.add(x);
        }
       }
       return true;
    }
}