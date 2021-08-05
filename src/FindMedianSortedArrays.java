public class FindMedianSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int num1Len = nums1.length;
        int num2Len = nums2.length;
        int [] nums = new int[num1Len+num2Len];
        int i = 0,j = 0,k = 0;
        int mid = (num1Len + num2Len)/2;
        while( i < num1Len && j < num2Len) {
            if (nums1[i] < nums2[j]) {

                nums[k] = nums1[i];
                i++;k++;
            }else {

                nums[k] = nums2[j];
                j++;k++;
            }

        }
        while (i < num1Len){

            nums[k] = nums1[i];
            i++;k++;

        }
        while (j < num2Len){
            nums[k] = nums2[j];
            j++;k++;

        }
       if (((num1Len+num2Len)&1) == 0){
           return (nums[mid]+nums[mid-1])/2.0;
       }else {
           return  nums[mid];
       }

    }

    public static void main(String[] args) {
        int [] num1 = {1,2};
        int [] num2 = {3,4};
        System.out.println(findMedianSortedArrays(num1,num2));

    }
}
