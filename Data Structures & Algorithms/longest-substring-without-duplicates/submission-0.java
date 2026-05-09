class Solution {
   public int lengthOfLongestSubstring(String s) {
        int left=0, right=0;
        int maxLength=0;
        HashSet<Character> seen = new HashSet<>();
        while (right < s.length()){
            while (seen.contains(s.charAt(right))){
                seen.remove(s.charAt(left));
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
            seen.add(s.charAt(right));
            right++;
        }
        
        
        return maxLength;
    }
}
