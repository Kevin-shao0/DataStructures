package sort;


import java.util.Arrays;

/**
 * @author shkstart
 * @create 2021-07-08-9:07
 */
public class ShellSort {
    public static void main(String[] args) {
    int [] arr={8,9,1,7,2,3,5,4,6,0};
    shellSort1(arr);
        System.out.println(Arrays.toString(arr));

    }
    //希尔排序交换式

    public static void shellSort(int[] arr) {
        int temp = 0;
        for (int k = arr.length / 2; k > 0; k /= 2) {
            for (int i = k; i < arr.length; i++) {
                for (int j = i - k; j >= 0; j -= k) {
                    if (arr[j] > arr[j + k]) {
                        temp = arr[j];
                        arr[j] = arr[j + k];
                        arr[j + k] = temp;
                    }
                }
            }

        }
    }

//希尔排序移动法
    public static void shellSort1(int [] arr){
        for (int k = arr.length / 2; k > 0; k /= 2) {
            for (int i=k;i<arr.length;i++){
                int j=i;
                int temp=arr[j];
                while (j-k>=0&&temp<arr[j-k]){
                    arr[j]=arr[j-k];
                    j-=k;
                }
                arr[j]=temp;
            }
    }
    }
}
