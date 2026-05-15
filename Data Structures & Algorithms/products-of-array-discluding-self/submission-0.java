class Solution {
    public int[] productExceptSelf(int[] nums) {
        {
            if (nums.length==0){
                return new int[0];
            }
         ArrayList<Integer> res = new ArrayList<>();
        res.add(1);
        
        for (int i = 1; i < nums.length; i++) {
            res.add( nums[i-1] * res.get(i-1));
        }
        int rightProduct = 1;
        for (int i = nums.length-1; i >= 0 ; i-- ){
            res.set(i, rightProduct * res.get(i));
            rightProduct = rightProduct * nums[i];
        }
return res.stream().mapToInt(i->i).toArray();    }
    }
}  
