package search;

/**
 * @author shkstart
 * @create 2021-07-09-14:55
 */
public class SeqSearch {
    public static void main(String[] args) {
        int[] arr={1,9,11,3,5,-1};
        int index=seqSearch(arr,-1);
        System.out.println(index);
    }
    //线性查找(找到一个满足条件的值)
    public static  int seqSearch(int[] arr,int value){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==value){
                return i;
            }
        }
        return -1;
    }
}
