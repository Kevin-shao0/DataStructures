package search;

import java.util.ArrayList;

/**
 * @author shkstart
 * @create 2021-07-09-15:11
 */
public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,2,2,3,4,6,9,89};
//        int index=binarySearch(arr,0,6,88);
//        System.out.println(index);
        ArrayList<Integer> resIndexList = new ArrayList<>();
        resIndexList=binarySearch2(arr,0,8,2);
        System.out.println(resIndexList);
    }
    public static int binarySearch(int[] arr,int left,int right,int findVal){
        if (left>right){
            return -1;
        }
        int mid=(left+right)/2;
        if(findVal>arr[mid]){
            return binarySearch(arr,mid+1,right,findVal);
        }
        else if (findVal<arr[mid]){
            return binarySearch(arr,left,mid-1,findVal);
        }
        else{return mid;}

    }



//返回所有查找到的下标
    public static ArrayList<Integer> binarySearch2(int[] arr, int left, int right, int findVal){
        if (left>right){
            return new ArrayList<Integer>();
        }
        int mid=(left+right)/2;
        if(findVal>arr[mid]){
            return binarySearch2(arr,mid+1,right,findVal);
        }
        if (findVal<arr[mid]){
            return binarySearch2(arr,left,mid-1,findVal);
        }
        else{
            ArrayList<Integer> resIndexList = new ArrayList<>();
            int temp=mid-1;
            while (true) {

                if (temp< 0 || arr[temp] != findVal) {
                    break;
                }
               resIndexList.add(temp);
                temp--;
            }
            resIndexList.add(mid);
             temp=mid+1;
            while (true) {

                if (temp >right || arr[temp] != findVal) {
                    break;
                }
                resIndexList.add(temp);
                temp++;
            }
            return resIndexList;


        }

    }
}
