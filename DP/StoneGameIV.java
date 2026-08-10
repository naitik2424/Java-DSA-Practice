package DP;

class StoneGameIV {
    public static boolean winnerSquareGame(int n) {
        boolean[] dp =new boolean[n+1];
        dp[0] = false;
        for(int i=1;i<=n;i++){
            for(int j =1;j*j<=i;j++){
                int remaining =i-j*j;
                if(!dp[remaining]){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        System.out.println(winnerSquareGame(4));
    }
}