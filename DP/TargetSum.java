import java.util.*;

public class TargetSum {

    public int findTargetSumWays(int[] nums, int target){

        int sum = 0;

        for(int n : nums) sum += n;

        if(Math.abs(target) > sum) return 0;
        if((sum + target) % 2 != 0) return 0;

        int subsetSum = (sum + target) / 2;

        int[] dp = new int[subsetSum + 1];

        dp[0] = 1;

        for(int num : nums){

            for(int j = subsetSum; j >= num; j--){

                dp[j] += dp[j - num];
            }
        }

        return dp[subsetSum];
    }

    public static void main(String[] args){

        int[] nums = {1,1,1,1,1};
        int target = 3;

        TargetSum obj = new TargetSum();

        System.out.println("Ways: " +
                obj.findTargetSumWays(nums, target));
    }
}