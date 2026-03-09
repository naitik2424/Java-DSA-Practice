import java.util.*;
//here it takes O(n^2) time and O(n) space
public class LongestIncreasingSubsequenceDP {

    public int lengthOfLIS(int[] nums) {

        int n = nums.length;

        int[] dp = new int[n];

        Arrays.fill(dp, 1);

        for(int i = 1; i < n; i++){

            for(int j = 0; j < i; j++){

                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }

            }

        }

        int max = 0;

        for(int val : dp){
            max = Math.max(max, val);
        }

        return max;
    }

    public static void main(String[] args){

        int[] nums = {10,9,2,5,3,7,101,18};

        LongestIncreasingSubsequenceDP obj = new LongestIncreasingSubsequenceDP();

        System.out.println("LIS length: " + obj.lengthOfLIS(nums));
    }
}