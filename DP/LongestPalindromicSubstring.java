public class LongestPalindromicSubstring {

    public String longestPalindrome(String s){

        int n = s.length();

        boolean[][] dp = new boolean[n][n];

        int start = 0;
        int maxLength = 1;

        for(int i = 0; i < n; i++)
            dp[i][i] = true;

        for(int len = 2; len <= n; len++){

            for(int i = 0; i <= n-len; i++){

                int j = i + len - 1;

                if(s.charAt(i) == s.charAt(j)){

                    if(len == 2 || dp[i+1][j-1]){

                        dp[i][j] = true;

                        if(len > maxLength){

                            start = i;
                            maxLength = len;

                        }

                    }

                }

            }

        }

        return s.substring(start, start + maxLength);
    }

    public static void main(String[] args){

        String s = "babad";

        LongestPalindromicSubstring obj = new LongestPalindromicSubstring();

        System.out.println("Longest Palindrome: " + obj.longestPalindrome(s));
    }
}