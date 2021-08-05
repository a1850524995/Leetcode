public class MinPathSum {
    public static void main(String[] args) {
        int [][]matrix = {{1,3,5,9,6},{8,1,3,4,6},{5,0,6,1,7},{8,8,4,0,8}};
        System.out.println(minPathSum(matrix));

    }
    public static int minPathSum (int[][] matrix) {
        int m= matrix[0].length;
        int n = matrix.length;
        int[][]dept = new int[n][m];
        dept[0][0] = matrix[0][0];
        for (int i = 0;i < n;i++) {
            for (int j = 0; j < m; j++) {
                if (i==0 && j ==0){
                    dept[i][j] = matrix[0][0];
                }else if (i == 0 && j != 0){
                    dept[i][j] = dept[i][j-1] + matrix[i][j];
                }else if (j == 0 && i != 0){
                    dept[i][j] = dept[i-1][j] + matrix[i][j];
                }else {
                    dept[i][j] = Integer.min(dept[i-1][j] +matrix[i][j],dept[i][j-1]+matrix[i][j]);
                }
            }

        }
        // write code here
        return dept[n-1][m-1];
    }
}
