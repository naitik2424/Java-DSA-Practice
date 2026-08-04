package array;
import java.util.Arrays;
public class MinimizeTheHeight2 {
    public int minimizeTheHeight(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);
        int ans = arr[n - 1] - arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] >= k) {
                int min = Math.min(arr[0] + k, arr[i] - k);
                int max = Math.max(arr[i - 1] + k, arr[n - 1] - k);
                ans = Math.min(ans, max - min);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        MinimizeTheHeight2 obj = new MinimizeTheHeight2();
        int[] arr = {1, 5, 8, 10};
        int k = 2;
        System.out.println("The minimum difference between the heights is: " + obj.minimizeTheHeight(arr, k));
    }
}