package array;

// not and optimized approach
// it is just a better approach then brute 
// 
import java.util.HashMap;

public class LongestSubArraySumK {
    public static int longestSubarray(int[] nums, int k) {

        HashMap<Long, Integer> preSumMap = new HashMap<>();

        long sum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            long rem = sum - k;

            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5};
        int k =5;
        System.out.print("the longest length is: ");
        System.out.println(longestSubarray(arr,k));
    }
}




// Brute force
// class Solution {
//     public int longestSubarray(int[] nums, int k) {
//        int n = nums.length;
//        int len = 0;

//        for(int i =0;i<n;i++){
//         for(int j =i;j<n;j++){
//             int sum=0;

//             for(int x=i ;x<=j;x++){
//                 sum+=nums[x];
//             }
//             if(sum == k){
//                 len = Math.max(len, j-i+1);
//             }
            
//         }
//        }
//        return len;
//     }
// }