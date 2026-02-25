// 1️⃣ DailyTemperatures.java
// LeetCode 739

// Pattern: Monotonic Decreasing Stack (Next Greater)

import java.util.*;

public class DailyTemperatures {

    public static int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;
        int[] answer = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() &&
                   temperatures[i] > temperatures[stack.peek()]) {

                int prevIndex = stack.pop();
                answer[prevIndex] = i - prevIndex;
            }

            stack.push(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] temps = {73,74,75,71,69,72,76,73};
        int[] result = dailyTemperatures(temps);

        System.out.println(Arrays.toString(result));
    }
}