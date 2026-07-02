class Solution {
    public boolean isAnagram(String s, String t) {
      int sLen = s.length();
      int tLen = t.length();
      if(sLen != tLen){
        return false;
      }
      int[] expectedFreq = new int[26];
      int[] windowFreq = new int[26];
      for(Character c : s.toCharArray()){
        expectedFreq[c-'a']++;
      }
      for (Character c : t.toCharArray()){
        windowFreq [c - 'a'] ++;
      }
      for (int i = 0; i < 26; i++){
        if (expectedFreq[i] != windowFreq[i]){return false;}
      }
      return true;
    }
}
