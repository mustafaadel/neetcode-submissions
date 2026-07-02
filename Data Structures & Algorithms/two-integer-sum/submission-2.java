class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
        3-0 7-3 =4 4 exits? no, keep looping
        4-1 7-4 = 3 3 exists ? yes, return {hashmap.get3 , i}
        */
        HashMap<Integer, Integer> seen = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++){
            int compliment = target - nums[i]; // compliment = 4
            if(seen.containsKey(compliment)){
                return new int[]{seen.get(compliment), i};
            }
            seen.put(nums[i], i);
        }
        return new int[]{};
    }
}
