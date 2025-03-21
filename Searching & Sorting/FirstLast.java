class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstOccur = -1;
        int lastOccur = -1;
        int n = nums.length;

        for(int i=0; i<n; i++){
            if(nums[i] == target){
                if(firstOccur == -1){
                    firstOccur = i;
                }
                lastOccur = i;
            }
        }
        return new int[] {firstOccur, lastOccur};
    }
}
