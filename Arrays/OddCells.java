class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int a[][] = new int[m][n];

        for(int i=0; i<indices.length; i++){
            int r = indices[i][0];
            int c = indices[i][1];
            for(int j=0; j<n; j++){
                a[r][j]++;
            }

            for(int j=0; j<m; j++){
                a[j][c]++;
            }
        }

        int ans = 0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(a[i][j]%2!=0) ans++;
            }
        }

        return ans;
    }
}
