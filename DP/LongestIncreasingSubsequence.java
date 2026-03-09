// LeetCode 300
// Pattern: LIS (Binary Search)
// Time: O(n log n)
// package DP;

import java.util.*;

public class LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {

        List<Integer> tails = new ArrayList<>();

        for (int num : nums) {

            int left = 0;
            int right = tails.size();

            while (left < right) {

                int mid = (left + right) / 2;

                if (tails.get(mid) < num) {
                    left = mid + 1;
                } else {
                    right = mid;
                }

            }

            if (left == tails.size()) {
                tails.add(num);
            } else {
                tails.set(left, num);
            }

        }

        return tails.size();
    }

    public static void main(String[] args) {

        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};

        LongestIncreasingSubsequence obj = new LongestIncreasingSubsequence();

        int result = obj.lengthOfLIS(nums);

        System.out.println("Length of LIS: " + result);
    }
}
