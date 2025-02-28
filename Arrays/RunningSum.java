class Solution {
    public int[] runningSum(int[] nums) {
        
        int n = nums.length;
        int[] arr =  new int[n];

        int add = 0;
        for(int i=0; i<n; i++){
            add = add + nums[i];
            arr[i] = add;
        }

        return arr;
    }
}
