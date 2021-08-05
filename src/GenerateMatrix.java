import java.util.ArrayList;
import java.util.List;

public class GenerateMatrix {
    public static void main(String[] args) {
        int [][]mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> res = new GenerateMatrix().spiralOrder(mat);
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int rowLen  = matrix.length;
        int colLen = matrix[0].length;
        int len = colLen * rowLen;
        int t = 0;
        int b =  rowLen - 1;
        int l = 0;
        int r = colLen - 1;
        int index = 1;

        while (index <= len){
            for (int i = l; i <= r; i++) {
                res.add(matrix[t][i]);
                index++;
            }
            t++;
            if (t > b)break;
            for (int i = t ;i<= b;i++){
                res.add(matrix[i][r]);
                index++;
            }
            r--;
            if (r < l) break;
            for (int i = r; i>=l;i--){
                res.add(matrix[b][i]);
                index++;
            }
            b--;
            if (b < t) break;
            for (int i = b;i>= t;i--){
                res.add(matrix[i][l]);
                index++;
            }
            l++;
            if (l > r) break;

        }


        return res;
    }
    public int[][] generateMatrix(int n) {
        int res[][] = new int[n][n];
        int t = 0;
        int l = 0;
        int r = n - 1;
        int b = n - 1;
        int num = 1;
        int target = n*n;

        while (num <= target){
            for (int i = l ;i <= r; i++){
                res[t][i] = num;
                num++;
            }
            t++;

            for (int i = t; i <= b;i++){
                res[i][r] = num;
                num++;
            }
            r--;

            for (int i = r; i >= l; i--) {
                res[b][i] = num++;
            }
            b--;

            for (int i = b;i >= t; i--){
                res[i][l] = num++;
            }
            l++;



        }
          return res;

    }
}
