import java.util.HashMap;

public class BinarySubarraysWithSum {

    public static int numSubarraysWithSum(int[] nums, int goal) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);   // prefix sum 0 ek baar pehle se

        int currentSum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            currentSum += nums[i];

            if (map.containsKey(currentSum - goal)) {
                count += map.get(currentSum - goal);
            }

            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {1, 0, 1, 0, 1};
        int goal = 2;

        int result = numSubarraysWithSum(nums, goal);
        System.out.println(result);   // Expected output: 4
    }
}
