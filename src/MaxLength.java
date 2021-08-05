import java.util.HashMap;

public class MaxLength {
    /**
     * 滑动窗口，把<a[i]，i>装进map里。
     * @param arr
     * @return
     */
    public int maxLength (int[] arr) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int left = 0;
        int maxLen = 0;
        for (int i = 0;i < arr.length;i++){
            if (hashMap.containsKey(arr[i])) {
                left = Integer.max(left, hashMap.get(arr[i])+1);
            }
            hashMap.put(arr[i],i);
            maxLen = Integer.max(maxLen, i-left+1);

        }
        return maxLen;
    }
}
