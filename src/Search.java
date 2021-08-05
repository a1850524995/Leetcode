public class Search {
    public int search(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) {
            return -1;
        }
        if (n == 1) {
            return nums[0] == target ? 0 : -1;
        }

        int left = 0;
        int right = nums.length-1;

        while (left <= right){
            int mid = (left+right)/2;
            if (target == nums[mid]) {
                return mid;
            }
            if (nums[left] <= nums[mid]){ // 有序
                if (nums[left] <= target && target < nums[mid]){
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }
            }else {
                if (nums[mid] < target && target <= nums[right]){
                    left = mid +1;
                }else{
                    right = mid -1;
                }
            }
        }
        return -1;


    }
}
