package array;
import java.util.*;
// Optimized approach
public class MoveZeros {
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int[] moveZeros(int n,int[] arr){
        int j=-1;
        for(int i=0;i<n;i++){
            if(arr[i] ==0){
                j=i;
                break;
            }
        }
        for(int i = j+1;i<n;i++){
            if(arr[i] !=0){
                swap(arr,i,j);
                j++;
            }
        }
        return arr;
    }

   

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 0, 3, 4};
        int n = arr.length;

        for(int num : moveZeros(n,arr)){
            System.out.print(num+" ");
        }
    }
}

// Time Complexity: O(n) - We traverse the array twice, but each traversal is linear in time complexity.
// Space Complexity: O(1) - We are not using any extra space that scales with input size.