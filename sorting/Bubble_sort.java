package sorting;

public class Bubble_sort {
    public static void bubble_sort(int[] arr,int n){
        for(int i=n-1;i>0;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        return;
    }
    public static void main(String[] args){
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;
        bubble_sort(arr, n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}

// t.c = O(n^2) and s.c = O(1)