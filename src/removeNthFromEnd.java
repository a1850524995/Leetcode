import java.util.Arrays;
import java.util.Comparator;

public class removeNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = new ListNode(0,head);
        ListNode first  = head;
        ListNode second = node;
        for (int i = 0 ;i < n ;i++){
            first = first.next;
        }
        while (first != null){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;

        return node.next;
    }

    public String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0){
            return "";
        }
        String [] strArray = new String[nums.length];
        for (int i = 0; i < strArray.length;i++){
            strArray[i]= String.valueOf(nums[i]);
        }
        Arrays.sort(strArray, new Comparator<String>() {
            //继承此方法的时候，要自定义比较器，conpareTo方法返回值为1(升序),0，-1(降序)
            //返回正值 交换；负值不交换
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2) ;
            }
        });
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0;i < strArray.length; i++){
            stringBuilder.append(strArray[i]);
        }
        String result = stringBuilder.toString();
        if (result.charAt(0) == '0'){
            return  "0";
        }

        return result;
    }
}
