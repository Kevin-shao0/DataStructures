package sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @author shkstart
 * @create 2021-07-07-20:17
 */
public class SelectSort {
    public static void main(String[] args) {
//        int[] arr = {1, 5, 2, 6, 3, 9};
        int [] arr=new int[80000];
        for (int i =0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*800000);
        }
        Date data1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String f1= simpleDateFormat.format(data1);
        System.out.println(f1);
        selectSort(arr);
        Date data2 = new Date();
        String f2 = simpleDateFormat.format(data2);
//        System.out.println(Arrays.toString(arr));
        System.out.println(f2);

    }
    //选择排序
    public static void selectSort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            int min=arr[i];
            int minIndex=i;
            for (int j=i+1;j<arr.length;j++){
                if (min>arr[j]){
                    min=arr[j];
                    minIndex=j;
                }

            }if (minIndex!=i) {
                arr[minIndex] = arr[i];
                arr[i] = min;
            }

        }
    }
}
