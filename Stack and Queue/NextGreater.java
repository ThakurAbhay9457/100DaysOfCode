class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> hash = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for(int i=nums2.length-1; i>=0; i--){
            while(!st.isEmpty() && st.peek() < nums2[i]){
                st.pop();
            }
            if(st.isEmpty()) hash.put(nums2[i], -1);
            else hash.put(nums2[i], st.peek());
            st.push(nums2[i]);
        }

        int[] ans = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            ans[i] = hash.get(nums1[i]);
        }
        return ans;
    }
}
