import java.util.*;
//day 36
//leetdcode 416. Partition Equal Subset Sum
public class PartitionEqualSubsetSum {

    public boolean canPartition(int[] nums){

        int sum = 0;

        for(int n : nums) sum += n;

        if(sum % 2 != 0) return false;

        int target = sum / 2;

        boolean[] dp = new boolean[target + 1];

        dp[0] = true;

        for(int num : nums){

            for(int j = target; j >= num; j--){

                dp[j] = dp[j] || dp[j - num];
            }
        }

        return dp[target];
    }

    public static void main(String[] args){

        int[] nums = {1,5,11,5};

        PartitionEqualSubsetSum obj =
                new PartitionEqualSubsetSum();

        System.out.println("Can Partition: " +
                obj.canPartition(nums));
    }
}