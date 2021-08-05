import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    Map<Character,Integer> symbolValues = new HashMap<Character, Integer>(){{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};
    public int romanToInt(String s) {
        char[] array = s.toCharArray();
        int ans = 0;
        int n = array.length;
        for (int i = 0; i < array.length; i++ ){
            int value = symbolValues.get(array[i]);
            if (i < n-1 && symbolValues.get(array[i]) < symbolValues.get(array[i+1])){
                ans -= value;
            }else {
                ans += value;
            }
        }
        return ans;

    }
}
