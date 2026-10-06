class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;

        int [][] result = new int[r][c];

        if(row*col != r*c){
            return mat;
        }

        int k = 0;
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                result[k/c][k%c] = mat[i][j];
                k++;
            }
        }
        return result;
    }
}