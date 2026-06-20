package Greedy;

public class LC55_JumpGame {
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) return true;
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                return false;
            }
            maxReach = Math.max(maxReach, i + nums[i]);
        }
        return true;
    }
}
