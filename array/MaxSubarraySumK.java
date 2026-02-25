public class MaxSubarraySumK {
    public static int maxSumSubArray(int[] arr,int k){
        int windowSum = 0;
        // Step 1: sum of first window
        for(int i = 0;i < k; i++){
            windowSum += arr[i];

        }
        int maxSum = windowSum;
        // step 2: slide the window
        for(int i = k; i < arr.length; i++){
            windowSum = windowSum - arr[i - k] + arr[i];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;



    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println(maxSumSubArray(arr, k));
    }
    
}
