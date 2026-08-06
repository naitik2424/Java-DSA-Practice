package array;
import java.util.*;

//  my solution

// class LongestConsecutiveSequence {
//     public static void main(String[] args) {
//         int[] arr = {102,4,100,1,101,3,2,1,1};
//         Arrays.sort(arr);
//         int longest = 1;
//         int cnt = 1;
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] == arr[i - 1]) {
//                 continue;              
//             }
//             if (arr[i] == arr[i - 1] + 1) {
//                 cnt++;
//             } else {
//                 longest = Math.max(longest, cnt);
//                 cnt = 1;
//             }
//         }
//         longest = Math.max(longest, cnt);
//         System.out.println(longest);
//     }
// }


// Brute Force Approach
// package array;

// class LongestConsecutiveSequence {
//     static boolean linearSearch(int[] arr, int target) {
//         for (int num : arr) {
//             if (num == target) {
//                 return true;
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         int[] arr = {102, 4, 100, 1, 101, 3, 2, 1, 1};
//         int longest = 1;
//         for (int i = 0; i < arr.length; i++) {
//             int x = arr[i];
//             int count = 1;
//             while (linearSearch(arr, x + 1)) {
//                 x = x + 1;
//                 count++;
//             }
//             longest = Math.max(longest, count);
//         }
//         System.out.println("Longest Consecutive Sequence Length = " + longest);
//     }
// }
// t.c = O(n^2) and s.c = O(1)



// Better Approach
// class LongestConsecutiveSequence {
//     public static void main(String[] args){
//         int[] arr = {1,1,1,2,2,3,3,4,100,100,101,102};
        // Arrays.sort(arr);      t.c(nlogn)
//         int longest = 1;
//         int cntcurr = 0;
//         int lastSmaller= Integer.MIN_VALUE;
//         int n = arr.length;
//         for(int i=0;i<n;i++){
//             if(arr[i]-1 == lastSmaller){
//                 cntcurr++;
//                 lastSmaller = arr[i];
//             } else if(arr[i] != lastSmaller) {
                
//                 cntcurr = 1;
//                 lastSmaller = arr[i];
//             }
//             longest = Math.max(longest, cntcurr);
//         }
//         System.out.println(longest);
//     }
// }
// t.c = O(nlogn) and s.c = O(1)(ignoring the space used by sorting)

// Optimal Approach
class LongestConsecutiveSequence{
    public static void main(String[] args){
        int[] arr = {1,1,1,2,2,3,3,4,100,100,101,102};
        int n=arr.length;
        if(n==0){
            System.out.println(0);
            return;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int longest=1;
        for(int num : set){
            if(!set.contains(num-1)){
                int current = num;
                int count = 1;
                while(set.contains(current+1)){
                    current++;
                    count++;
                }
                longest= Math.max(longest,count);


            }
        }
        System.out.print("Longest Consecutive sequence: ");
        System.out.println(longest);
    }
}

// t.c = O(2n) and s.c = O(n)