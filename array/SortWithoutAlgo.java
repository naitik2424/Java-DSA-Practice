package array;

public class SortWithoutAlgo {
    public static void main(String[] args){
        int[] arr = {2,1,0,1,0,2};
        int n = arr.length;
        int low =0,mid=0,high =n;
        while(mid<high){
            if(arr[mid]==0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
            }
        }
    }
    
}
