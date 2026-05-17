class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Set<Integer> numSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int longestChain = 0;
        for (int num : nums) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int chainLen = 1;
                while (numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    chainLen += 1;
                }
                longestChain = Math.max(longestChain, chainLen);
            }
        }
        return longestChain;
    }
}
