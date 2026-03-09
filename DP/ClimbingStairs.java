// LeetCode 70

// Pattern: 1D DP (Counting Ways)
public class ClimbingStairs {

    public static int climbStairs(int n) {

        if (n <= 2) return n;

        int prev2 = 1; // dp[1]
        int prev1 = 2; // dp[2]

        for (int i = 3; i <= n; i++) {
            int current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }

    public static void main(String[] args) {

        int n = 5;
        int result = climbStairs(n);

        System.out.println("Total Ways: " + result);
    }
}