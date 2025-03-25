class Solution {
    public int reachNumber(int target) {
        
        int step = 0;
        int count = 0;

        target = Math.abs(target);
        while(count < target || (count - target)% 2 != 0){
               step++; 
               count += step; 
        }

        return step;
    }
}
