class Solution {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1) {
            return 0; 
        }
        int largest = Integer.MIN_VALUE; 
        int largestIndex = -1; 

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) { 
                largest = nums[i];  
                largestIndex = i;    
            }
        }
        return largestIndex;
    }
}
