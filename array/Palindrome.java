package array;

import java.util.*;

class Palindrome {

    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();   // READ STRING
        
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindrome(s);
        System.out.println(result);
    }
}
