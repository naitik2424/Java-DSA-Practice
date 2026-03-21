import java.util.*;

public class SplitArrayLargestSum {

    public int splitArray(int[] nums, int k) {

        int left = 0;
        int right = 0;

        // Step 1: Define search space
        for(int num : nums){
            left = Math.max(left, num);
            right += num;
        }

        // Step 2: Binary Search on Answer
        while(left < right){

            int mid = left + (right - left) / 2;

            if(canSplit(nums, k, mid)){
                right = mid;
            } else {
                left = mid + 1;
            }

        }

        return left;
    }

    // Step 3: Check function
    private boolean canSplit(int[] nums, int k, int maxSum){

        int sum = 0;
        int count = 1;

        for(int num : nums){

            if(sum + num > maxSum){
                count++;
                sum = num;
            } else {
                sum += num;
            }

        }

        return count <= k;
    }

    public static void main(String[] args){

        int[] nums = {7,2,5,10,8};
        int k = 2;

        SplitArrayLargestSum obj = new SplitArrayLargestSum();

        int result = obj.splitArray(nums, k);

        System.out.println("Minimum Largest Sum: " + result);
    }
}