class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        for(int ans: nums1){
            set1.add(ans);
        }

        HashSet<Integer> set2=new HashSet<>();
        for(int ans: nums2){
            if(set1.contains(ans)){
                set2.add(ans);
            }
        }

        int[] arr = new int[set2.size()];
        int index = 0;
        for(int ans:set2){
            arr[index++] = ans;
        }
        return arr;
    }
}
