class Solution {
    public void rotate(int[] nums, int k) {
        
        int n = nums.length;
        int ans = k % n;
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[(i + ans) % n] = nums[i];
        }
        for(int i=0; i<n; i++){
            nums[i] = arr[i];
        }

    }
}
