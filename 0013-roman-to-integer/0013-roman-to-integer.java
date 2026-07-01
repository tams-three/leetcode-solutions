import java.util.*;
class Solution {
    public int romanToInt(String s) {
      HashMap <Character , Integer> map = new HashMap <> ();
      map.put('I', 1);
      map.put('V', 5);
      map.put('X', 10);
      map.put('L', 50);
      map.put('C', 100);
      map.put('D', 500);
      map.put('M', 1000);
      int ans = 0;
      int len = s.length();
      for(int i = 0 ; i < len ; i++){
        int currval = map.get(s.charAt(i));
        if(i<len-1 && currval<map.get(s.charAt(i+1))){
            ans -= currval;
        }
        else{
            ans += currval;
        }
      }
      return ans;
      
    }
}

