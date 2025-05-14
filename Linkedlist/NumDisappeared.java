class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        boolean[] isAvailable = new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            isAvailable[nums[i]-1] = true;
        }
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<isAvailable.length; i++){
            if(!isAvailable[i]){
                res.add(i+1);
            }
        }
        return res;
    }
}
