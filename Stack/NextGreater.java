import java.util.*;

public class NextGreater {

    public static int[] nextGreater(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && nums[i] > nums[st.peek()]) {
                int idx = st.pop();
                result[idx] = nums[i];
            }

            st.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 2, 10};
        int[] result = nextGreater(nums);
        System.out.println(Arrays.toString(result));
    }
}

// Time Complexity = O(n)
// Space Complexity = O(n)