class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> freq = new HashMap<>();
        for(String str : strs){
            int[] count = new int[26];
            for (Character ch : str.toCharArray()){
                count[ch -'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int num : count){
                sb.append(num).append("#");
            }
            String key = sb.toString();
            freq.computeIfAbsent(key, k->new ArrayList<>()).add(str);
        }
        return new ArrayList<>(freq.values());
    }
}
