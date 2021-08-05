public class QuickSort {
    public static void quickSort(int arr[],int left,int right){
        int mid;
        if (left<right){
            mid = partion(arr,left,right);
            quickSort(arr,left,mid-1);
            quickSort(arr,mid+1,right);
        }
    }

    private static int partion(int[] arr, int left, int right) {
        int pri =arr[left];
        while (left<right){
            while(left<right && pri <arr[right]){
                right--;
            }
            arr[left]=arr[right];
            while (left < right && arr[left]<= pri){
                left++;
            }
            arr[right] =arr[left];
        }
        arr[left] = pri;
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {23,13,21,3,15,78,45};
        quickSort(arr,0,arr.length-1);
        for (int i = 0;i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
