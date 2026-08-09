package DP;
import java.util.*;
class Fibonacci{
    static int  f(int n,int[] dp){
        if(n<=1) return n;
        if(dp[n] != -1) return dp[n];
        dp[n] = f(n-1,dp)+ f(n-2,dp);
        return dp[n];
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);

        System.out.println(f(n,dp));
        sc.close();
    }
}

// T.C. = O(n)
// S.C. = O(n)