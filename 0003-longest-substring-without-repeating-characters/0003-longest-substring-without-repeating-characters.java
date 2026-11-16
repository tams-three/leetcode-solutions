class Solution {
    public int lengthOfLongestSubstring(String s) {
      int windowStart = 0;
      int windowEnd = 0;
      int n = s.length();
      int maxlen = Integer.MIN_VALUE;
      HashMap<Character, Integer> map = new HashMap<>();
      while(windowEnd<n){
        char ch = s.charAt(windowEnd);
        if(map.containsKey(ch) && map.get(ch)>=windowStart){
            windowStart = map.get(ch)+1;
        }
        map.put(ch,windowEnd);
        maxlen= Math.max(maxlen, windowEnd-windowStart + 1);
        windowEnd++;
      }
      return (maxlen==Integer.MIN_VALUE)?0:maxlen;  
    }
}