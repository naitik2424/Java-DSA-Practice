package Recursion;

public class Basic {
    public static void toPrint(int n){
        if(n==0){
            return;
        }else{
            System.out.println(n);

            toPrint(n-1);
        }
    }
    public static void main(String[] args){
        toPrint(5);
    }
}

// t.c = O(n)
// s.c = O(n)
