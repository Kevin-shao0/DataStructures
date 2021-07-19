package tree;

import java.util.Arrays;

/**
 * @author shkstart
 * @create 2021-07-19-15:38
 */
public class HeapSort {
    public static void main(String[] args) {
        //要求将数组进行升序排序
        int[] arr={4,6,8,5,9};
        heapSort(arr);
    }
    //编写一个堆排序的方法
    public static void heapSort(int arr[]){
        System.out.println("堆排序");
        int temp=0;
        //完成最终
        for(int i=arr.length/2-1;i>=0;i--){
            adjustHeap(arr,i,arr.length);
        }
        //将堆顶元素与末尾元素交换，将最大元素沉到数组末端
        for(int j=arr.length-1;j>0;j--){
            //交换
            temp=arr[j];
            arr[j]=arr[0];
            arr[0]=temp;
            adjustHeap(arr,0,j);
        }
        System.out.println(Arrays.toString(arr));
    }
    //将一个数组调整成大顶堆
    public static  void adjustHeap(int[] arr,int i,int lenght){
        int temp=arr[i];//先取出当前元素的值，保存在临时变量
        //开始调整
        //说明
        //1、k=i*2+1 k是i结点的左子结点
        for (int k=i*2+1;k<lenght;k=k*2+1){
            if (k+1<lenght&&arr[k]<arr[k+1]){
                k++;//i指向又子结点
            }if (arr[k]>temp){
                arr[i]=arr[k];
                i=k;
            }else{
                break;
            }
        }
        //当for循环结束后，我们已经将以i为父节点的树的最大值，放到了最顶（局部）
        arr[i]=temp;//将temp值放到调整后的位置
    }

}

