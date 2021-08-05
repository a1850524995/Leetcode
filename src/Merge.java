import java.util.Arrays;

public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int tail = m+n-1;
        int i = m-1;
        int j = n-1;
        while (i >= 0 || j >= 0 ){
            if (i == -1) {
                nums1[tail] = nums2[j];
                j--;
            }else if (j == -1){
                break;
            } else if (nums1[i] > nums2[j]){
                nums1[tail] =nums1[i];
                i--;
            }else {
                nums1[tail] =nums2[j];
                j--;
            }
            tail--;
        }

    }
}
