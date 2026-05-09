class Solution {
    public boolean isAnagram(String s, String t) {
        int lenS = s.length();
        int lenT = t.length();
        if (lenT != lenS) return false;
        int [] expectedFreq = new int[26];
        int [] windowFreq = new int[26];
        for (Character c : t.toCharArray()){
            expectedFreq[c - 'a'] ++;
        }
        for (Character c : s.toCharArray()){
            windowFreq[c - 'a'] ++;
        }
        for (int i = 0; i < 26; i++){
            if (expectedFreq[i] != windowFreq[i]){
                return false;
            }
        }
        return true;
    }
}
