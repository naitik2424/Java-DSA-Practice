package array;
public class SortedArray {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 6, 7, 8};
        boolean isSorted = true;  // assume sorted initially

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;  // found an unsorted pair
                break;
            }
        }

        System.out.println("Array is sorted: " + isSorted);
    }
}
