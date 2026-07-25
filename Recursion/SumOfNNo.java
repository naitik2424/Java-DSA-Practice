package Recursion;

public class SumOfNNo{
    // public static int N_sum(int i,int sum){
    //     if(i<1){
    //         return sum;
    //     }
    //     return N_sum(i-1,sum+i);
    // }
    public static int f(int n){
        if(n==0){
            return 0;
        }
        return n+f(n-1);
    }
    public static void main(String[] args){
        System.out.println(f(100));
    }
}

// t.c = O(n)
// s.c = O(n)