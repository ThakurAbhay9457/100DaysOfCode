class Solution {
    public void setZeroes(int[][] matrix) {

        boolean f1 = false;
        boolean f2 = false;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    if(i == 0) f1 = true;
                    if(j == 0) f2 = true;
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[0].length; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        if(f1){
            for(int j=0; j<matrix[0].length; j++){
                matrix[0][j] = 0;
            }
        }
        if(f2){
            for(int i=0; i<matrix.length; i++){
                matrix[i][0] = 0;
            }
        }
    }
}
