import java.math.BigInteger;
import java.util.Arrays;

public class CuttingRope {
    public int cuttingRope(int n) {
        int[] dep = new int[n+1];
        dep[2] = 1;
        for (int i = 3; i <= n;i++){
            for (int j = 2;j < i;j++){
                dep[i] =Math.max(Math.max(j*(i-j),j*dep[i-j]),dep[i]) ;
            }
        }
        return dep[n];


    }
    public int cuttingRope1(int n) {
      /*  BigInteger[] dep = new BigInteger[n+1];
        Arrays.fill(dep,BigInteger.valueOf(1));
        for (int i = 3; i <= n;i++){
            for (int j = 2;j < i;j++){
                dep[i] =Math.max(Math.max(j*(i-j),j*dep[i-j]),dep[i]) ;
            }
        }
        return dep[n];
*/
      return 0;

    }
}
