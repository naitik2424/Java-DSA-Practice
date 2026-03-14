public class PrintLCS {

    public static String lcs(String text1, String text2) {

        int n = text1.length();
        int m = text2.length();

        int[][] dp = new int[n+1][m+1];

        // Step 1: Build DP table
        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= m; j++){

                if(text1.charAt(i-1) == text2.charAt(j-1)){

                    dp[i][j] = 1 + dp[i-1][j-1];

                } else {

                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);

                }

            }

        }

        // Step 2: Backtrack to build LCS string
        int i = n;
        int j = m;

        StringBuilder result = new StringBuilder();

        while(i > 0 && j > 0){

            if(text1.charAt(i-1) == text2.charAt(j-1)){

                result.append(text1.charAt(i-1));
                i--;
                j--;

            }
            else if(dp[i-1][j] > dp[i][j-1]){

                i--;

            }
            else{

                j--;

            }

        }

        return result.reverse().toString();
    }

    public static void main(String[] args){

        String text1 = "abcde";
        String text2 = "ace";

        String ans = lcs(text1, text2);

        System.out.println("LCS: " + ans);

    }
}