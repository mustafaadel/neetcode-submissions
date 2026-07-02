class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num : nums){
            int cnt = freq.getOrDefault(num, 0) + 1;
            freq.put (num,cnt);
        }
        List<Map.Entry<Integer,Integer>> entries = new ArrayList<>(freq.entrySet());
        entries.sort((a,b)-> Integer.compare(b.getValue(),a.getValue()));
        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = entries.get(i).getKey();
        }
        return result;

    }
}
