public class GetLongestPalindrome {
    public static int getLongestPalindrome(String A, int n) {
        boolean [][]temp = new boolean[n][n];
        char arr[] = A.toCharArray();

        for (int j = 1; j < n ;j++){
            for (int i = 0; i < j ;i++){
                if ((j-i<3) && arr[i] == arr[j]){
                    temp[i][j] = true;
                }else if ((j-i>=3) && arr[i] == arr[j]){
                    temp[i][j] = temp[i+1][j-1];
                }else{
                    temp[i][j] =false;
                }
            }
        }
        int maxLen = 1;
        for (int i = 0; i < n; i++){
            for (int j = i; j < n; j++){
                if (temp[i][j]== true) {
                    maxLen = Integer.max(maxLen,j-i+1);
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(getLongestPalindrome("aba",3));
    }
}
