class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        s= s.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
              .toString();
        t = t.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
              .toString();
        for(int i = 0; i < s.length(); i ++){
            if (s.charAt(i) != t.charAt(i))
                return false;
        }
        return true;
    }
}
