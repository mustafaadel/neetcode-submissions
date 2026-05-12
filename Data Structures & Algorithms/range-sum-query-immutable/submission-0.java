class NumArray {
    private ArrayList<Integer> prefixSum = new ArrayList<>();
    public NumArray(int[] nums) {
        prefixSum.add(nums[0]);
        for (int i = 1 ; i < nums.length; i++){
            prefixSum.add(prefixSum.get(i-1) + nums[i]);
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0){
            return prefixSum.get(right);
        }
        return prefixSum.get(right) - prefixSum.get(left - 1);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */