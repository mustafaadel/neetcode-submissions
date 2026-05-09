class Solution {
    public boolean hasDuplicate(int[] nums) {
        int arrayLength = nums.length;
        Set<Integer> set = new HashSet<>();
        for (int i = 0 ; i < arrayLength; i++ ){
            set.add(nums[i]);
        }
        return arrayLength != set.size();
    }
}