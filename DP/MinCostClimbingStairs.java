// LeetCode 746

// Pattern: 1D DP (Minimization)

package DP;
public class MinCostClimbingStairs {

    public static int minCostClimbingStairs(int[] cost) {

        int prev2 = cost[0];
        int prev1 = cost[1];

        for (int i = 2; i < cost.length; i++) {
            int current = cost[i] + Math.min(prev1, prev2);
            prev2 = prev1;
            prev1 = current;
        }

        return Math.min(prev1, prev2);
    }

    public static void main(String[] args) {

        int[] cost = {10, 15, 20};
        int result = minCostClimbingStairs(cost);

        System.out.println("Minimum Cost: " + result);
    }
}