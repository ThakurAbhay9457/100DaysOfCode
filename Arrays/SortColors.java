class Solution {
    public void sortColors(int[] nums) {

        int n = nums.length;
        int mid=0, start=n-1,end=0;
        while(mid<=start){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[end];
                nums[end]=temp;
                end++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{                 // arr[mid]==2
                int temp=nums[mid];
                nums[mid]=nums[start];
                nums[start]=temp;
                start--;
            }
        }
    }
}
