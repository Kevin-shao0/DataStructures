package sort;

import com.sun.media.sound.FFT;
import com.sun.org.apache.bcel.internal.generic.DDIV;
import com.sun.org.apache.xpath.internal.Arg;
import org.junit.Test;

import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * @author shkstart
 * @create 2021-07-08-14:03
 */
public class QuickSort {
    public static void main(String[] args) {
        int [] arr={-9,78,0,23,-567,70};
        quickSort(arr,0,5);
        System.out.println(Arrays.toString(arr));


    }

    //快速排序
    public static void quickSort(int[] arr,int left, int right) {
        int temp = 0;
        int i = left;
        int j = right;
        int mid = arr[(left + right) / 2];
        while (i < j) {
            while (arr[j] > mid) {
                j--;
            }
            while (arr[i] < mid) {
                i++;
            }

//            if (i >= j) {
//                break;
//            }
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            if(arr[i] == mid){
                i+=1;
            }
            if (arr[j]==mid){
                j-=1;
            }
        }

            if (i == j) {
                i = i + 1;
                j = j - 1;
            }
                if (left < j) {
                    quickSort(arr, left, j);
                }
                if (right>i){
                    quickSort(arr, i, right);
                }

            }







}
