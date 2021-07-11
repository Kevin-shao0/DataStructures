package sort;

import java.util.Arrays;

/**
 * @author shkstart
 * @create 2021-07-09-9:35
 */
public class RadixSort {
    public static void main(String[] args) {
        int[] arr={543,4,6,8,10};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }



    public static void radixSort(int [] arr){
//        取最大值
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        //得到最大数是几位数
        int maxLength=(max +"").length();

        int[][] bucket=new int [10][arr.length];
        int[] bucketElementCounts=new int[10];
        for (int i=0;i<maxLength;i++){
            for (int j=0;j<arr.length;j++){
                int digitOfElement=arr[j]/(10^i)%10;
                //放入对应的桶中
                bucket[digitOfElement][bucketElementCounts[digitOfElement]]=arr[j];
                bucketElementCounts[digitOfElement]++;
            }
            //按照这个桶的顺序（一维数组下标依次取出数据，放入原来数组）
            int index=0;
            //遍历桶，并将桶中的数据。放入到原数组
            for (int k=0;k<bucketElementCounts.length;k++){
                if (bucketElementCounts[k]!=0){
                    for (int l=0;l<bucketElementCounts[k];l++){
                        arr[index++]=bucket[k][l];
                    }
                }
                bucketElementCounts[k]=0;
            }
        }

    }
}
