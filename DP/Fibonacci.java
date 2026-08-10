package DP;
// import java.util.*;
// // memorization
// class Fibonacci{
//     static int  f(int n,int[] dp){
//         if(n<=1) return n;
//         if(dp[n] != -1) return dp[n];
//         dp[n] = f(n-1,dp)+ f(n-2,dp);
//         return dp[n];
//     }
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] dp = new int[n+1];
//         Arrays.fill(dp,-1);

//         System.out.println(f(n,dp));
//         sc.close();
//     }
// }

// T.C. = O(n)
// S.C. = O(n) + o(n)


// // tabulization

// import java.util.Scanner;

// public class Fibonacci {
//     static int f(int n) {
//         if (n <= 1) return n;

//         int[] dp = new int[n + 1];

//         dp[0] = 0;
//         dp[1] = 1;

//         for (int i = 2; i <= n; i++) {
//             dp[i] = dp[i - 1] + dp[i - 2];
//         }

//         return dp[n];
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         System.out.println(f(n));

//         sc.close();
//     }
// }

// t.c = o(n)
// s.c=o(n)


class Fibonacci{
    public static void main(String[] args){
        int n = 10;
        if(n<=1){
            System.out.println(n);
            return;
        }
        int prev2 = 0;
        int prev =1;
        for(int i=2;i<n;i++){
            int curi = prev + prev2;
            prev2 = prev;
            prev=curi;
        }
        System.out.println(prev);
    }
}

// T.C. = O(n)
// S.C. = O(1)