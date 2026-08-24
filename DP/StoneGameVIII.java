package DP;
class StoneGameVIII {
    public static int stoneGameVIII(int[] stones) {
        int n= stones.length;
        int[] pre = new int[n+1];
        pre[0] =stones[0];
        for(int i=1;i<n;i++){
            pre[i] = stones[i]+ pre[i-1];
        }
        int dp[] =new int[n+1];
        dp[n-1] = pre[n-1];
        for(int i =n-2;i>=1;i--){
            dp[i] =Math.max(dp[i+1],pre[i]-dp[i+1]);
        }
        return dp[1];
    }
    public static void main(String[] args) {
        int[] stones = {-1,2,-1,4,-5};
        System.out.println(stoneGameVIII(stones));
    }
}











