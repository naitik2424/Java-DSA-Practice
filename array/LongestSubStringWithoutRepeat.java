
import java.util.HashSet;

public class LongestSubStringWithoutRepeat {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {

            // shrink window if duplicate found
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            // expand window
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }


    public static void main(String[] args) {
        LongestSubStringWithoutRepeat solution = new LongestSubStringWithoutRepeat();
        String s = "abcabcbb";
        System.out.println(solution.lengthOfLongestSubstring(s)); // Output: 3
    }
}