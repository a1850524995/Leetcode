public class MajorityElement {
    public int majorityElement(int[] nums) {
        int vote = 0;
        int majority = 0;
        int count = 0;
        for (int i = 0;i < nums.length;i++){
           if (vote == 0){
               majority = nums[i];
           }
           if (majority == nums[i]){
               vote++;
           }else {
               vote--;
           }

        }
        for (int i = 0; i < nums.length;i++){
            if (nums[i] == majority){
                count++;
            }
        }
        if (count >= nums.length/2){
            return majority;
        }else {
            return 0;
        }

    }
}
