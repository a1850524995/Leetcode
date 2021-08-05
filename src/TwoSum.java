import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(numWays(n));

    }
    public int[] twoSum (int[] numbers, int target) {
        HashMap<Integer,Integer> resIndexMap = new HashMap<>();
        for (int i = 1;i <= numbers.length;i++ ){
            if (resIndexMap.containsKey(target-numbers[i])){
                return new int[]{resIndexMap.get(target-numbers[i]),i};
            }
            resIndexMap.put(numbers[i],i);
        }
        return new int [0];
    }

    public static int numWays(int n) {
        if (n == 0){
          return 1;
        }
        if (n < 3 && n > 0){
            return n;
        }
        int []dep = new int [n+1];
        dep[1] = 1;
        dep[2] = 2;
        for(int i = 3;i <=n;i++){
            dep[i] = dep[i-1]+dep[i-2];
        }
        return dep[n];
    }
}
