package sorting;

public class Merge_sort{
    

    public static void merge_sort(int[] arr,int low,int mid,int high){
        int temp[] = new int[high-low+1];
        int left =low,right=mid+1;
        int k=0;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[k++] = arr[left++];
            }
            else{
                temp[k++] = arr[right++];
            }
        }
        while(left<=mid){
            temp[k++] = arr[left++];
        }
        while(right<=high){
            temp[k++] = arr[right++];
        }
        for(int i=0;i<k;i++){
            arr[low+i] = temp[i];
        }
    }
    public static void merge(int[] arr,int low,int high){
        
        if(low<high){
            int mid = (low+high)/2;
            merge(arr,low,mid);
            merge(arr,mid+1,high);
            merge_sort(arr,low,mid,high);
        }
    }

}
    