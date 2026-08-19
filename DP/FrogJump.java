package DP;
public class FrogJump {
    static int frogJump(int ind, int[] height) {
        if (ind == 0) {
            return 0;
        }
        int left = frogJump(ind - 1, height)
                + Math.abs(height[ind] - height[ind - 1]);

        int right = Integer.MAX_VALUE;
        if (ind > 1) {
            right = frogJump(ind - 2, height)
                    + Math.abs(height[ind] - height[ind - 2]);
        }
        return Math.min(left, right);
    }

    public static void main(String[] args) {
        int[] height = {10, 20, 30, 10};
        int n = height.length;
        int answer = frogJump(n - 1, height);
        System.out.println("Minimum cost = " + answer);
    }
}
