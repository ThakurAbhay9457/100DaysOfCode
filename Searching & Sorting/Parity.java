class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int idx = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] % 2 == 0){
                int temp = nums[idx];
                nums[idx] = nums[i];
                nums[i] = temp;
                idx++;
            }
        }
        if(nums.length == 0){
            return nums;
        }

        return nums;
    }
}
