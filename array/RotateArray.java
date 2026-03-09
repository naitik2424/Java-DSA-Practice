package array;

import java.util.Scanner;

// Left rotate the array by one place

public class RotateArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // store first element
        int temp = arr[0];

        // shift elements to left
        for(int i = 0; i < n-1; i++){
            arr[i] = arr[i+1];
        }

        // place first element at last
        arr[n-1] = temp;

        System.out.println("Array after left rotation:");

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}