package Recursion;

public class Palindrome {
    int n;
    public static boolean isPalindrome(String s,int i){
        if(i>=s.length()/2){
            return true;
        }
        if(s.charAt(i) != s.charAt(s.length()-i-1)){
            return false;
        }
        return isPalindrome(s, i+1);
    }
    public static void main(String[] args){
        String s="racecar";
        System.out.println(isPalindrome(s,0));
    }
}
// t.c: O(n/2) = O(n)
// s.c: O(n) for the recursive stack space
