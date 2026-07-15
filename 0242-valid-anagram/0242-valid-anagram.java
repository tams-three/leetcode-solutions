class Solution {
    public boolean isAnagram(String s, String t) {
        int count[] = new int[26];
        char ch[] = s.toCharArray();
        char che[] = t.toCharArray();
        for(char c: ch){
            count[c - 'a']++;
        }

        for(char c: che){
            count[c - 'a']--;
        }
        for(int i : count){
        if(i != 0){
            return false;
        }
    }
        return true;
    }
}