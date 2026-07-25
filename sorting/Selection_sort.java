package sorting;

public class Selection_sort{
    public static int selection_sort(int arr[], int n){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr[n-1];
    }
    public static void main(String args[]){
        int arr[] = {64, 25, 12, 22, 11};
        int n=arr.length;
        selection_sort(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Sorted array");
    }
}
// t.c = O(n^2) and s.c = O(1)