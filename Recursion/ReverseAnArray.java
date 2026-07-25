package Recursion;

public class ReverseAnArray {
    public static void reverse(int arr[], int l, int r){
        if(l>=r){
            return;
        }else{
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
        }
        reverse(arr,l+1,r-1);
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};

        if(arr.length==0){
            System.out.println("Please provide an array"); 
            return;
        }   
        reverse(arr,0,arr.length-1);
        // Print the reversed array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        } 
    }
    
}
