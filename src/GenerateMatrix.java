public class GenerateMatrix {
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
