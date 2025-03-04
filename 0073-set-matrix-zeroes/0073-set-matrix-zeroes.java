class Solution {
    public void setZeroes(int[][] matrix) {
        boolean fRow = false;
        boolean fCol = false;

        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++){
            if(matrix[i][0] == 0){
                fCol = true;
                break;
            }
        }

        for (int j = 0; j < n; j++){
            if(matrix[0][j] == 0){
                fRow = true;
                break;
            }
        }

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(fCol){
            for(int i = 0; i < m; i++){
                matrix[i][0] = 0;
            }
        }

        if(fRow){
            for(int j = 0; j < n; j++){
                matrix[0][j] = 0;
            }
        }
    }
}