public class CountPalindromicSubstrings {

    public int countSubstrings(String s) {

        int count = 0;

        for(int i = 0; i < s.length(); i++){

            count += expand(s, i, i);     // odd palindrome
            count += expand(s, i, i+1);   // even palindrome

        }

        return count;
    }

    private int expand(String s, int left, int right){

        int count = 0;

        while(left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)){

            count++;

            left--;
            right++;

        }

        return count;
    }

    public static void main(String[] args){

        String s = "aaa";

        CountPalindromicSubstrings obj =
                new CountPalindromicSubstrings();

        System.out.println(
                "Total Palindromes: " +
                obj.countSubstrings(s)
        );
    }
}