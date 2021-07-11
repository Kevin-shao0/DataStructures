package search;

/**
 * @author shkstart
 * @create 2021-07-09-17:01
 */
public class InsertValueSearch {
    public static void main(String[] args) {
        int[] arr=new int[100];
        for (int i=0;i<arr.length;i++){
            arr[i]=i+1;
        }
        int insertValueSearch = insertValueSearch(arr, 0, arr.length - 1, 100);
        System.out.println(insertValueSearch);
    }
    public static int insertValueSearch(int[] arr,int left,int right,int value){

        if (left>right||value<arr[left]||value>arr[right]){
            return -1;
        }
        int mid=left+((value-arr[left])/(arr[right]-arr[left]))*(right-left);
        if(arr[mid]>value){
            return insertValueSearch(arr,left,mid-1,value);
        }else if (arr[mid]<value){
            return insertValueSearch(arr,mid+1,right,value);
        }else{
            return mid;
        }
    }
}
