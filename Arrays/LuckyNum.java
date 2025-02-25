class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        int idx = 0;

        for(int i=0; i<m; i++){
            int min = Integer.MAX_VALUE;
            
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j] < min){
                    min = matrix[i][j];

                    idx = j;
                }
            }
             
            int k = 0;
            for(k=0; k<m; k++){
                if(matrix[k][idx] > min) break;
            }
            if(k == m){
                ans.add(min);
            }
        }
        return ans;
    }
}
