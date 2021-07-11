package sort;

import java.util.Arrays;

/**
 * @author shkstart
 * @create 2021-07-07-21:32
 */
public class InsertSort {
    public static void main(String[] args) {
        int [] arr={101,34,119,1};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //插入排序
    public static void insertSort(int [] arr) {
        for (int i = 1; i < arr.length; i++) {
            int insertValue = arr[i];
            int insertIndex = i - 1;
            while (insertIndex >=0 && insertValue < arr[insertIndex]) {
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            //这里判断是否需要赋值
            if(insertIndex+1!=i) {
                arr[insertIndex + 1] = insertValue;
            }
        }
    }
}
