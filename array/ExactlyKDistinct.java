import java.util.HashMap;

public class ExactlyKDistinct {

    // helper: count subarrays with at most k distinct
    private static int atMost(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {
            int x = nums[right];
            map.put(x, map.getOrDefault(x, 0) + 1);

            while (map.size() > k) {
                int leftVal = nums[left];
                map.put(leftVal, map.get(leftVal) - 1);
                if (map.get(leftVal) == 0) {
                    map.remove(leftVal);
                }
                left++;
            }

            // count subarrays ending at right
            count += (right - left + 1);
        }
        return count;
    }

    public static int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    // MAIN method for VS Code
    public static void main(String[] args) {

        int[] nums = {1, 2, 1, 2, 3};
        int k = 2;

        int result = subarraysWithKDistinct(nums, k);
        System.out.println(result);
    }
}
