package sort;

import com.sun.javafx.image.BytePixelSetter;

import java.util.Arrays;

/**
 * @author shkstart
 * @create 2021-07-08-16:55
 */
public class MergetSort {
    public static void main(String[] args) {
        int arr[]={1,3,0,2,6,4,7,5};
        int temp[] = new int[arr.length];
         int left=0;
         int right=arr.length-1;
         megetsort(arr,0,arr.length-1,temp);
        System.out.println(Arrays.toString(arr));


    }
    //分+治
    public static void megetsort(int[] arr, int left,int right,int[] temp) {
        if (left < right) {
            int mid = (left+right )/ 2;
            //左递归
            megetsort(arr,left,mid,temp);
            //右递归
            megetsort(arr,mid+1,right,temp);
            merge(arr,left,right,mid,temp);
        }
    }

    //归并排序合并


    public static void merge(int[] arr,int left,int right,int mid,int[] temp){
        int i=left;
        int j=mid+1;
        int t=0;
        while (i<=mid&&j<=right){
           if (arr[i]<=arr[j]){
                temp[t]=arr[i];
                t++;
                i++;
            }
            else  {
                temp[t]=arr[j];
                t++;
                j++;
            }
        }
        while(i<=mid){
            temp[t]=arr[i];
            t++;
            i++;
        }
        while(j<=right) {
            temp[t]=arr[j];
            t++;
            j++;
        }
        //3.将temp数组中的值拷贝到arr,注意不是每次都拷贝所有
         t=0;
        int tempLeft=left;
        while (tempLeft<=right){
            arr[tempLeft]=temp[t];
            t++;
            tempLeft++;
        }



    }


}
