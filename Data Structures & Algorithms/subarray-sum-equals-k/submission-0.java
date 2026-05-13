class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();
        int currentPrefixSum=0;
        freq.put(0,1);
        for (int i = 0; i < nums.length; i++){
                        currentPrefixSum+=nums[i];

            if(freq.containsKey(currentPrefixSum-k)){
                count += freq.get(currentPrefixSum-k);
            }
        freq.put(currentPrefixSum, freq.getOrDefault(currentPrefixSum,0)+1);
        }
        return count;
    }
}