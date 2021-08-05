public class BigIntegerAdd {
    public static String solve (String s, String t) {

        char[] firstReverse = new StringBuffer(s).reverse().toString().toCharArray();
        char[] secondReverse = new StringBuffer(t).reverse().toString().toCharArray();
        int firstLen = firstReverse.length;
        int secondLen = secondReverse.length;
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        int flag = 0;
        while ( i < firstLen && i < secondLen) {
            int cur = firstReverse[i] -'0'+ secondReverse[i]-'0'+flag;
            if (cur >=10){
                cur = cur%10;
                flag = 1;
            }else {
                flag = 0;
            }
            i++;
            stringBuffer.append(cur);
        }
        while (i < firstLen) {
            while (flag ==1){
                int cur = firstReverse[i] -'0'+ +flag;
                if (cur > 10){
                    cur = cur%10;
                    flag = 1;
                }else {
                    flag = 0;
                }
                i++;
                stringBuffer.append(cur);

            }
            stringBuffer.append(firstReverse[i]);
            i++;
        }

        while (i < secondLen) {
            while (flag ==1){
                int cur = secondReverse[i] -'0'+ +flag;
                if (cur > 10){
                    cur = cur%10;
                    flag = 1;
                }else {
                    flag = 0;
                }
                i++;

                stringBuffer.append(cur);

            }
            stringBuffer.append(secondReverse[i]);
            i++;
        }
        if (flag == 1){
            stringBuffer.append('1');
        }
        return stringBuffer.reverse().toString();
    }



    public static void main(String[] args) {
        String first = "733064366";
        String second = "459309139";
        System.out.println(solve(first,second));
    }
}
