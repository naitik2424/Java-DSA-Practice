package array;

public class SortWithoutAlgo {
    public static void main(String[] args){
        int[] arr = {2,1,0,1,0,2};
        int n = arr.length-1;
        int low =0;
        int mid=0;
        int high =n;
        while(mid<=high){
            if(arr[mid]==0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                int temp = arr[high];
                arr[high]=arr[mid];
                arr[mid] =temp;
                high--;

            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
