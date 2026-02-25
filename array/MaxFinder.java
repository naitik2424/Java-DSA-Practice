package array;
// public class MaxInArray {
//     static int[] arr = {3, 5, 7, 2, 8, 6};
//     static int max = arr[0];

//     public static void findMax(int index) {
//         // base case
//         if (index == arr.length) {
//             return;
//         }
//         // compare current element with max
//         if (arr[index] > max) {
//             max = arr[index];
//         }
//         // recursive call
//         findMax(index + 1);
//     }
//     static class SecondMax{
//         static int max1  = Integer.MIN_VALUE;
//         static int max2 = Integer.MIN_VALUE;

//         static void findSecondMax(int index){
//             // base case
//             if(index == arr.length){
//                 return;
//             }
//             // update max1 and max2
//             if(arr[index] > max1){
//                 max2 = max1;
//                 max1 = arr[index];
//             } else if(arr[index] > max2 && arr[index] != max1){
//                 max2 = arr[index];
//             }
//             // recursive call
//             findSecondMax(index + 1);
//         }
//     }

//     public static void main(String[] args) {
//         findMax(0); // start recursion
//         System.out.println("Maximum element in array: " + max);
//         SecondMax.findSecondMax(0); // start recursion for second max
//         System.out.println("Second Maximum element in array: " + SecondMax.max2);
//     }
// }

// Program to find the Maximum and Second Maximum element in an array using recursion and classes

// --- Class 1: Finds the maximum element recursively ---
class FirstMaxFinder {
    static int[] arr = {3, 5, 7, 2, 8, 6};
    static int max = arr[0]; // store the maximum element

    // Private constructor to prevent object creation (utility class)
    // private FirstMaxFinder() { }

    // Recursive method to find the maximum element
    public static void findMax(int index) {
        if (index == arr.length) return; // base case
        if (arr[index] > max) max = arr[index]; // update max if needed
        findMax(index + 1); // recursive call
    }
}

// --- Class 2: Finds the second maximum element using the max from FirstMaxFinder ---
class SecondMaxFinder {
    static int secondMax = Integer.MIN_VALUE; // initialize with smallest possible integer

    public static void findSecondLargest() {
        int[] arr = FirstMaxFinder.arr;
        int max = FirstMaxFinder.max;

        // Edge case: array has less than 2 elements
        if (arr.length < 2) {
            System.out.println("Array doesn't have enough elements for a second maximum.");
            return;
        }

        // Loop through array to find second largest
        for (int num : arr) {
            if (num < max && num > secondMax) {
                secondMax = num;
            }
        }
    }
}

// --- Class 3: Main class (entry point of program) ---
public class MaxFinder {
    public static void main(String[] args) {
        // Step 1: Find maximum element
        FirstMaxFinder.findMax(0);
        System.out.println("Maximum element in array: " + FirstMaxFinder.max);

        // Step 2: Find second maximum element
        SecondMaxFinder.findSecondLargest();
        System.out.println("Second maximum element in array: " + SecondMaxFinder.secondMax);
    }
}

