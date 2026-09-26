package array;

public class SqrtOfX {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        int low = 1, high = x, ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid <= x / mid) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        SqrtOfX solver = new SqrtOfX();
        int x1 = 4;
        int x2 = 8;
        System.out.println("Sqrt of " + x1 + ": " + solver.mySqrt(x1));
        System.out.println("Sqrt of " + x2 + ": " + solver.mySqrt(x2));
    }
}
