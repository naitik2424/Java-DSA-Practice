package string;

// LC:- 2267 Check if There Is a Valid Parentheses String Path
class ValidParentheses {
    public boolean hasValidPath(char[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        // Path length odd hai to valid parentheses possible nahi
        if ((m + n - 1) % 2 != 0) {
            return false;
        }

        boolean[][][] dp = new boolean[m][n][m + n];

        // Starting cell '(' hona zaroori hai
        if (grid[0][0] == ')') {
            return false;
        }

        dp[0][0][1] = true;

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                for (int balance = 0; balance < m + n; balance++) {

                    if (!dp[i][j][balance]) {
                        continue;
                    }

                    // Down
                    if (i + 1 < m) {

                        int newBalance = balance;

                        if (grid[i + 1][j] == '(') {
                            newBalance++;
                        } else {
                            newBalance--;
                        }

                        if (newBalance >= 0) {
                            dp[i + 1][j][newBalance] = true;
                        }
                    }

                    // Right
                    if (j + 1 < n) {

                        int newBalance = balance;

                        if (grid[i][j + 1] == '(') {
                            newBalance++;
                        } else {
                            newBalance--;
                        }
                        if (newBalance >= 0) {
                            dp[i][j + 1][newBalance] = true;
                        }
                    }
                }
            }
        }
        return dp[m - 1][n - 1][0];
    }

    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        char[][] grid = {
                { '(', ')', '(', '(' },
                { '(', '(', ')', ')' },
                { '(', '(', '(', ')' },
                { ')', '(', ')', '(' }

        };

        System.out.println(vp.hasValidPath(grid));
    }
}