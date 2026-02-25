package array;
import java.util.*;

public class MoveZeros {

    // Function to move all zeros to the end of the array
    public static int[] moveZeros(int n, int[] a) {

        // 🔹 Step 1: Temporary list banate hain jisme non-zero elements store karenge
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                temp.add(a[i]); // sirf non-zero numbers daalo
            }
        }

        // 🔹 Step 2: Non-zero elements wapas original array me copy kar do
        int nz = temp.size(); // nz = number of non-zero elements

        for (int i = 0; i < nz; i++) {
            a[i] = temp.get(i);
        }

        // 🔹 Step 3: Baaki remaining positions par zero fill kar do
        for (int i = nz; i < n; i++) {
            a[i] = 0;
        }

        // Array modify ho gaya, return kar do
        return a;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 0, 3, 4};
        int n = arr.length;

        int[] result = moveZeros(n, arr);

        System.out.print("After moving zeros: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
