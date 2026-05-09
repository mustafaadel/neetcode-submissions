class Solution {
    public int characterReplacement(String s, int k) {
     HashMap<Character,Integer> freq = new HashMap<>();
     int left = 0, right = 0, maxLength=0, highestFreq=0;
     while (right < s.length()){
        freq.put(s.charAt(right), freq.getOrDefault(s.charAt(right), 0) + 1);
        highestFreq = Math.max(highestFreq, freq.get(s.charAt(right)));
        int numToReplace = (right - left + 1) - highestFreq;
        if (numToReplace > k){
            freq.put(s.charAt(left), freq.get(s.charAt(left))-1);
            left++;
        }
        maxLength = Math.max(maxLength, right - left + 1);
        right++;
     }   
     return maxLength;
    }
}
